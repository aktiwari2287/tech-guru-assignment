package com.brahmos.uiservice.services;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.reactive.function.client.WebClient;

import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;

@Service
public class UIService {
	
	@Autowired
	private WebClient.Builder webClientBuilder;

	@HystrixCommand(fallbackMethod = "allProductsFallBack", commandKey = "ui-service", groupKey = "ui-service")
	public Map<String, List<String>> getProducts() {
		return webClientBuilder.build().get().uri("http://search-service/product/all/").retrieve().bodyToMono(Map.class)
				.block();
	}
	

	public Map<String, List<String>> allProductsFallBack() {
		Map<String, List<String>> prods = new HashMap<String, List<String>>();
		return prods;
	}

}
