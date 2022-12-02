package com.capg.ShoppingCartDiscovery;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@SpringBootApplication
@EnableEurekaServer
public class ShoppingCartDiscoveryApplication {

	public static void main(String[] args) {
		SpringApplication.run(ShoppingCartDiscoveryApplication.class, args);
	}

}
