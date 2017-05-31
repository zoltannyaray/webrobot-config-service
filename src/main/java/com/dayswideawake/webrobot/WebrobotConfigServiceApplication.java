package com.dayswideawake.webrobot;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.config.server.EnableConfigServer;

@SpringBootApplication
@EnableConfigServer
public class WebrobotConfigServiceApplication {

	public static void main(String[] args) {
		SpringApplication.run(WebrobotConfigServiceApplication.class, args);
	}
}
