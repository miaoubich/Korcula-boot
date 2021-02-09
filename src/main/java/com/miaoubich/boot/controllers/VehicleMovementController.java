package com.miaoubich.boot.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class VehicleMovementController {

	@GetMapping("/vehicle-movement")
	public String home() {
		return "vehiclemovement";
	}
}
