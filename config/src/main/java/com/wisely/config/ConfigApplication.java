package com.wisely.config;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.config.server.EnableConfigServer;

@SpringBootApplication
@EnableConfigServer //1
//@EnableEurekaClient //2
@EnableDiscoveryClient
public class ConfigApplication {
	
	 public static void main(String[] args) {
	        SpringApplication.run(ConfigApplication.class, args);
	    }

}
