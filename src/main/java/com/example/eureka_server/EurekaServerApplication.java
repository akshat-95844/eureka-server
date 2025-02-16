package com.example.eureka_server;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

import java.util.logging.Logger;

@SpringBootApplication
@EnableEurekaServer
public class EurekaServerApplication {
	Logger.info("Added logger on the main application");
	public static void main(String[] args) {
		SpringApplication.run(EurekaServerApplication.class, args);
	}

}
