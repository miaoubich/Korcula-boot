package com.miaoubich.boot.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class VehicleController {

	@GetMapping("/vehicles")
	public String home() {
		return "vehicle";
	}
}
