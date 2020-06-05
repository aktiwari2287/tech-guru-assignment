package com.brahmos.search;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.ws.rs.core.MediaType;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;


@RestController
@RequestMapping("/product")
public class ProductService {

	@HystrixCommand(groupKey = "product-service", commandKey = "product-service", fallbackMethod = "allProductsFallBack")
	@RequestMapping(path = "/all", produces = MediaType.APPLICATION_JSON)
	public Map<String, List<String>> allProducts() {
		Map<String, List<String>> prods = new HashMap<String, List<String>>();
		prods.put("mobile", Arrays.asList("Nokia", "Samsung"));
		return prods;
	}
	
	@HystrixCommand(groupKey = "product-price", commandKey = "product-price", fallbackMethod = "priceFallBack")
	@RequestMapping(path = "/price", produces = MediaType.APPLICATION_JSON)
	public Map<String, String> productPrice() {
		Map<String, String> prods = new HashMap<String, String>();
		prods.put("mobile", "10000");
		prods.put("Laptop", "15000");
		prods.put("Computer", "13000");
		prods.put("IPad", "12000");
		return prods;
	}
	
	
	public Map<String, List<String>> allProductsFallBack() {
		Map<String, List<String>> prods = new HashMap<String, List<String>>();
		return prods;
	}

	public Map<String, String> priceFallBack() {
		Map<String, String> prods = new HashMap<String, String>();
		return prods;
	}

}
