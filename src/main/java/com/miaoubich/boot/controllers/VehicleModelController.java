package com.miaoubich.boot.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class VehicleModelController {

	@GetMapping("/vehicle-model")
	public String home() {
		return "vehiclemodel";
	}
}
