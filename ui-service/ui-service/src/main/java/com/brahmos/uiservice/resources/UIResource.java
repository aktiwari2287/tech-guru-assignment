package com.brahmos.uiservice.resources;

import java.util.List;
import java.util.Map;

import javax.ws.rs.core.MediaType;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.brahmos.uiservice.services.UIService;

@RestController
@RequestMapping("/product")
public class UIResource {

	@Autowired
	private UIService service;

	@GetMapping(path="/all", produces = MediaType.APPLICATION_JSON)
	public Map<String, List<String>> allProducts() {
		return service.getProducts();
	}

}
