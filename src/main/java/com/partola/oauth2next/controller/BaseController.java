package com.partola.oauth2next.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class BaseController {
	
	@GetMapping("/customers")
	public Dto getDto() {
		return new Dto();
	}
	
	@GetMapping("/")
	public Dto getDto1() {
		return new Dto();
	}
}
