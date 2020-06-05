package com.brahmos.hystrix;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;

@RestController
@RequestMapping("/hello")
public class HelloResource {

	@HystrixCommand(fallbackMethod = "fallbackHello", commandKey = "hello", groupKey = "hello")
	@RequestMapping("/")
	public String sayHello() {
		//int i=5/0;
		return "Hello, World";
	}

	public String fallbackHello() {
		return "fallback hello";
	}
}
