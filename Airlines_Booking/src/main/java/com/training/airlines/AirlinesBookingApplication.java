package com.training.airlines;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.mongodb.repository.config.EnableMongoRepositories;


@EnableMongoRepositories
@Configuration
@ComponentScan(basePackages= {"com.training.airlines.controller","com.training.airlines.services"})
@SpringBootApplication
public class AirlinesBookingApplication {

	public static void main(String[] args) {
		SpringApplication.run(AirlinesBookingApplication.class, args);
	}
}
