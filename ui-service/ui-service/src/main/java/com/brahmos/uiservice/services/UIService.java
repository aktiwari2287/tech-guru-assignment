package com.brahmos.uiservice.services;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.reactive.function.client.WebClient;

@Service
public class UIService {
	
	@Autowired
	private WebClient.Builder webClientBuilder;

	public Map<String, List<String>> getProducts() {
		return webClientBuilder.build().get().uri("http://search-service/product/all/").retrieve().bodyToMono(Map.class)
				.block();
	}

}
