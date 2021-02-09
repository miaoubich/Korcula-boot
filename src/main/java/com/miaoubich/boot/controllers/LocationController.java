package com.miaoubich.boot.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class LocationController {

	@GetMapping("/location")
	public String home() {
		return "location";
	}
}
