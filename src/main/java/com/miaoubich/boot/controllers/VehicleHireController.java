package com.miaoubich.boot.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class VehicleHireController {

	@GetMapping("/vehicle-hire")
	public String home() {
		return "/vehiclehire";
	}
}
