package org.java.controllers;

import org.springframework.web.bind.annotation.GetMapping;

public class MainController {

	@GetMapping
	public String index() {
		return "index";
	}
	
}
