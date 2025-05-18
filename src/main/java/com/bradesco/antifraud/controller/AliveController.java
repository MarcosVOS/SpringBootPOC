package com.bradesco.antifraud.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class AliveController {

	@GetMapping("/")
	public String index() {
		return "the application is ok";
	}
}