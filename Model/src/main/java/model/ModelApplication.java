package model;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.cache.annotation.EnableCaching;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.hateoas.config.EnableHypermediaSupport;
import org.springframework.transaction.annotation.EnableTransactionManagement;
import org.springframework.transaction.annotation.Transactional;

@SpringBootApplication
@EnableAutoConfiguration
@EntityScan({"model.*"})
@EnableJpaRepositories({"model.*"})
@ComponentScan({"model"})
@EnableTransactionManagement
@Transactional
@EnableCaching
@EnableHypermediaSupport(type = EnableHypermediaSupport.HypermediaType.HAL)
public class ModelApplication implements CommandLineRunner {
	
	public static void main(String[] args) {
		SpringApplication.run(ModelApplication.class, args);
	}
	
	@Override
	public void run(String... args) throws Exception {
		
	}

}
