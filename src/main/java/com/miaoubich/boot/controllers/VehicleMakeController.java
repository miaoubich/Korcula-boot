package com.miaoubich.boot.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class VehicleMakeController {

	@GetMapping("/vehicle-make")
	public String home() {
		return "vehiclemake";
	}
}
