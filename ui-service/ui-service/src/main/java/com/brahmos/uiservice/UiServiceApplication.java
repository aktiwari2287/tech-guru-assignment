package com.brahmos.uiservice;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.circuitbreaker.EnableCircuitBreaker;
import org.springframework.cloud.netflix.hystrix.EnableHystrix;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@SpringBootApplication
@Controller("/")
@EnableCircuitBreaker
@EnableHystrix
public class UiServiceApplication {


	@GetMapping("/")
	public String index( ) {
		return "index.html";
	}
	public static void main(String[] args) {
		SpringApplication.run(UiServiceApplication.class, args);
	}

}
