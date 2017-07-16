package model.jdbc.resourceProcessor;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;
import org.springframework.data.mapping.context.PersistentEntities;
import org.springframework.data.rest.core.support.SelfLinkProvider;
import org.springframework.data.rest.webmvc.config.RepositoryRestMvcConfiguration;
import org.springframework.data.rest.webmvc.mapping.Associations;
import org.springframework.data.rest.webmvc.mapping.LinkCollector;
import org.springframework.hateoas.*;
import org.springframework.stereotype.Component;

import javax.persistence.Entity;
import javax.persistence.Id;
import java.io.Serializable;
import java.lang.reflect.Field;
import java.lang.reflect.ParameterizedType;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.stream.StreamSupport;

@Configuration
@Component
public class GeneralProcessor implements ResourceProcessor<Resource<? extends Serializable>> {
	
	private final RepositoryRestMvcConfiguration configuration;
	private final RelProvider relProvider;
	
	@Autowired
	public GeneralProcessor(RepositoryRestMvcConfiguration configuration, RelProvider relProvider) {
		this.configuration = configuration;
		this.relProvider = relProvider;
	}
	
	@Override
	public Resource<? extends Serializable> process(Resource<? extends Serializable> resource) {
		Class annotationsHolder = resource.getContent().getClass();
		if (!annotationsHolder.isAnnotationPresent(Entity.class))
			return resource;
		
		Object id = getId(resource);
		if (id == null)
			return resource;
		
		List<Link> resourceLinks = new ArrayList<>(resource.getLinks());
		resource.removeLinks();
		
		addLinks(resource, id);
		//addOldLinks(resource, resourceLinks);
		return resource;
	}
	
	private Object getId(Resource resource) {
		Class annotationsHolder = resource.getContent().getClass();
		Object id = null;
		for (Field field : annotationsHolder.getDeclaredFields()) {
			if (field.isAnnotationPresent(Id.class)) {
				try {
					field.setAccessible(true);
					id = field.get(resource.getContent());
					break;
				} catch (IllegalAccessException e) {
					e.printStackTrace();
				}
			}
		}
		return id;
	}
	
	private void addLinks(Resource resource, Object id) {
		Class annotationsHolder = resource.getContent().getClass();
		for (Field field : annotationsHolder.getDeclaredFields()) {
			if (field.isAnnotationPresent(ReverseResourceRelation.class)) {
				Class fieldClass = field.getType();
				String relation;
				if (Collection.class.isAssignableFrom(field.getType())) {
					fieldClass = (Class) ((ParameterizedType) field.getGenericType()).getActualTypeArguments()[0];
					relation = relProvider.getCollectionResourceRelFor(fieldClass);
				} else {
					relation = relProvider.getItemResourceRelFor(fieldClass);
				}
				Link link = configuration.entityLinks().linkToSingleResource(fieldClass, id).withRel(relation);
				resource.add(link);
			}
		}
	}
	
	private void addOldLinks(Resource resource, List<Link> resourceLinks) {
		resourceLinks.stream()
				.filter(link ->
								resource.getLinks().stream()
										.noneMatch(linkOld ->
														   linkOld.getRel().equals(link.getRel())))
				.forEach(resource::add);
	}
	
	@Primary
	@Bean
	@Autowired
	protected LinkCollector linkCollector(PersistentEntities persistentEntities, SelfLinkProvider selfLinkProvider, Associations associationLinks) {
		return new LinkCollector(persistentEntities, selfLinkProvider, associationLinks) {
			//No duplicate links by name
			@Override
			public Links getLinksFor(Object object, List<Link> existingLinks) {
				Links links = super.getLinksFor(object, existingLinks);
				List<Link> distinctLinks = new ArrayList<>(existingLinks);
				
				StreamSupport.stream(links.spliterator(), false)
						.filter(link ->
										distinctLinks.stream()
												.noneMatch(link1 ->
																   link.getRel().equals(link1.getRel()))
							   ).forEach(distinctLinks::add);
				
				return new Links(distinctLinks);
			}
		};
	}
}
