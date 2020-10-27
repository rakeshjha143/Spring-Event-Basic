package com.basic.event;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication
@EntityScan("com.basic.event.model.entity")
@EnableJpaRepositories("com.basic.event.repository.AirlineRepository")
@EnableAutoConfiguration
public class SpringEventBasicApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringEventBasicApplication.class, args);
	}

}
