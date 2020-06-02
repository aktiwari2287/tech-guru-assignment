package com.brahmos.uiservice;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller("/")
public class UiService {

	@GetMapping("/")
	public String index( ) {
		return "index.html";
	}
}
