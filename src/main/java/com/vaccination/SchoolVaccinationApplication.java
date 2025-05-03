package com.vaccination;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.data.mongodb.repository.config.EnableMongoRepositories;

@SpringBootApplication(scanBasePackages= {"com"})
@EntityScan(basePackages = {"com"})
@EnableJpaRepositories(basePackages = {"com"})
@ComponentScan(basePackages = {("com")})
@EnableMongoRepositories
public class SchoolVaccinationApplication {

	public static void main(String[] args) {
		SpringApplication.run(SchoolVaccinationApplication.class, args);
	}

}
