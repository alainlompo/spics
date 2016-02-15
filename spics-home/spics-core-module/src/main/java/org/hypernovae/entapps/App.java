package org.hypernovae.entapps;

import org.hypernovae.entapps.spics.repository.CustomerRepository;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.data.jpa.repository.JpaRepository;
import org.hypernovae.entapps.spics.domain.Customer;
import org.hypernovae.entapps.spics.repository.CustomerRepository;
/**
 * Hello world!
 *
 */
@SpringBootApplication
@EnableJpaRepositories(basePackageClasses=CustomerRepository.class)
public class App 
{
	private static final Logger LOGGER = LoggerFactory.getLogger(App.class);
    public static void main( String[] args )
    {
       SpringApplication.run(App.class);
    }
    
    
    @Bean
    public CommandLineRunner doShow(CustomerRepository repository) {
    	return (args) ->  {
    		// persist a few customers
    		repository.save(new Customer("HYPERNOVAE", "hypnv@hypnv.org"));
    		repository.save(new Customer("XCLTA", "xclta@xclta.org"));
    		repository.save(new Customer("ELSAM INTERNATIONAL", "elsam@ei.org"));
    		
    		// Fetching
    		LOGGER.info("Looking up all customers...");
    		LOGGER.info("----------------------------");
    		for (Customer cust: repository.findAll()) {
    			LOGGER.info(cust.toString());
    		}
    		LOGGER.info("");
    		
    		LOGGER.info("Look up a Customer by ID for ID=1L");
    		Customer firstCust = repository.findOne(Long.valueOf(1L));
    		LOGGER.info(firstCust.toString());
    		LOGGER.info("");
    		
    	};
    	
    }
}
