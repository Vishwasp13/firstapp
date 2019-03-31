package com.cloud.firstapp.controller;


import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Controller {
	private static final Logger log = LoggerFactory.getLogger(Controller.class);
	@GetMapping(value="/hello")
	public String sayHello() {
		log.info("Received a request.");
		return "Hello World";
	}
}