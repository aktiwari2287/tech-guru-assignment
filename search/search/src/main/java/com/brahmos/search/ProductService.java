package com.brahmos.search;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.ws.rs.core.MediaType;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
@RequestMapping("/product")
public class ProductService {

	@RequestMapping(path = "/all", produces = MediaType.APPLICATION_JSON)
	public Map<String, List<String>> allProducts() {
		Map<String, List<String>> prods = new HashMap<String, List<String>>();
		prods.put("mobile", Arrays.asList("Nokia", "Samsung"));
		return prods;
	}
}
