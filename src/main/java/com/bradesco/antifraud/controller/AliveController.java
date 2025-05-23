package com.bradesco.antifraud.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class AliveController {

	@GetMapping("/")
	public String index() {
		return "the application is ok";
	}

	@GetMapping("/one")
	public String index1() {
		return "the application is ok";
	}

	@GetMapping("/two")
	public String index2() {
		return "the application is ok";
	}

	@GetMapping("/three")
	public String index3() {
		return "the application is ok";
	}
	@GetMapping("/four")
	public String index4() {
		return "the application is ok";
	}

	@GetMapping("/five")
	public String index5() {
		return "the application is ok";
	}

	@GetMapping("/six")
	public String index6() {
		return "the application is ok";
	}

	@GetMapping("/seven")
	public String index7() {
		return "the application is ok";
	}

	@GetMapping("/eight")
	public String index8() {
		return "the application is ok";
	}
}