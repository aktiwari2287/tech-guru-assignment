package com.brahmos.priceservice;

import java.util.List;
import java.util.Map;

import javax.ws.rs.core.MediaType;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.reactive.function.client.WebClient;

@RestController
@RequestMapping("/product")
public class PriceService {

	@Autowired
	private WebClient.Builder webClientBuilder;

	@RequestMapping(path = "/price/all", produces = MediaType.APPLICATION_JSON)
	public Map<String, List<String>> allProductsPrice() {
		return webClientBuilder.build().get().uri("http://search-service/product/all/").retrieve().bodyToMono(Map.class)
				.block();
	}
}
