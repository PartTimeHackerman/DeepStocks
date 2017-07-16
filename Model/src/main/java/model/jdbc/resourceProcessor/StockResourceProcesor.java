package model.jdbc.resourceProcessor;

import model.data.Candle;
import model.data.Stock;
import model.data.Symbol;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.rest.webmvc.config.RepositoryRestMvcConfiguration;
import org.springframework.hateoas.RelProvider;
import org.springframework.hateoas.Resource;
import org.springframework.hateoas.ResourceProcessor;

public class StockResourceProcesor implements ResourceProcessor<Resource<Stock>> {
	
	private final RepositoryRestMvcConfiguration configuration;
	private final RelProvider relProvider;
	
	@Autowired
	public StockResourceProcesor(RepositoryRestMvcConfiguration configuration, RelProvider relProvider) {
		this.configuration = configuration;
		this.relProvider = relProvider;
	}
	
	@Override
	public Resource<Stock> process(Resource<Stock> resource) {
		resource.add(configuration.entityLinks().linkToSingleResource(Candle.class, resource.getContent().getId()).withRel(relProvider.getCollectionResourceRelFor(Candle.class)));
		resource.add(configuration.entityLinks().linkToSingleResource(Symbol.class, resource.getContent().getId()).withRel("symbols"));
		//if (resource.getContent().getBinaryDatas() != null)
		//resource.add(configuration.entityLinks().linkToSingleResource(BinaryData.class, resource.getContent().getId()).withRel("binaryData"));
		return resource;
	}
}
