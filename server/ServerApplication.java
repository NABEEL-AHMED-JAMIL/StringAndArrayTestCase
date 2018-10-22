package com.ballistic.server;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.mongodb.repository.config.EnableMongoRepositories;

@Configuration
@SpringBootApplication
@EnableMongoRepositories(basePackages = "com.ballistic.server.repository", mongoTemplateRef = "serverMongoTemplate")
public class ServerApplication implements ApplicationRunner {

	private static final Logger logger = LogManager.getLogger(ServerApplication.class);

	public static void main(String[] args) {
		SpringApplication.run(ServerApplication.class, args);
	}

	@Override
	public void run(ApplicationArguments args) throws Exception {
		logger.info("************************************************************");
		logger.info("Start printing mongo objects");
		logger.info("************************************************************");
		logger.info("***************************Save**************************");
		logger.info("************************************************************");
		logger.info("Ended printing mongo objects");
		logger.info("************************************************************");
	}
}