package com.nau.digitalhospital;

import com.mongodb.MongoClient;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.data.mongodb.core.MongoTemplate;
import org.springframework.data.mongodb.repository.config.EnableMongoRepositories;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;

import java.net.UnknownHostException;

@SpringBootApplication
@EnableMongoRepositories
@EnableWebSecurity
public class DigitalHospitalApplication {
	@Bean
	public MongoClient mongoClient() {
		return new MongoClient();
	}

	@Bean
	public MongoTemplate mongoTemplate() throws UnknownHostException {
		return new MongoTemplate(mongoClient(), "hospital");
	}

	public static void main(String[] args) {
		SpringApplication.run(DigitalHospitalApplication.class, args);
	}

}
