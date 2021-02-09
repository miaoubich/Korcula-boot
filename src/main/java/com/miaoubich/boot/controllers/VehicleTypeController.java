package com.miaoubich.boot.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class VehicleTypeController {

	@GetMapping("/vehicle-type")
	public String home() {
		return "vehicletype";
	}
}
