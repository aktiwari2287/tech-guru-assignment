package com.brahmos.cartservice;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringBootApplication
@EnableEurekaClient
public class CartManagmentServiceApplication {

	public static void main(String[] args) {
		SpringApplication.run(CartManagmentServiceApplication.class, args);
	}

}
