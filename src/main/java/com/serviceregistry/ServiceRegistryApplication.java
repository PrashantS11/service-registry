package com.serviceregistry;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@SpringBootApplication
@EnableEurekaServer
public class ServiceRegistryApplication {

	private static final Logger log = LoggerFactory.getLogger(ServiceRegistryApplication.class);

	public static void main(String[] args) {

		log.info("ServiceRegistryApplication starting... ");
		SpringApplication.run(ServiceRegistryApplication.class, args);
	}

}
