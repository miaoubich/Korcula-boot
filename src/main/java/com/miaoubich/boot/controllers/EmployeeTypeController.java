package com.miaoubich.boot.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class EmployeeTypeController {

	@GetMapping("/employee-type")
	public String home() {
		return "employeetype";
	}
}
