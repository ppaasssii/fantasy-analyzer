package com.sleeperextension.fantasyanalyzer;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.mongodb.repository.config.EnableMongoRepositories;

@SpringBootApplication
@EnableMongoRepositories(basePackages = "com.sleeperextension.fantasyanalyzer")
public class FantasyAnalyzerApplication {

	public static void main(String[] args) {
		SpringApplication.run(FantasyAnalyzerApplication.class, args);
	}

}
