package com.miaoubich.boot;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class MyController {
	
	@GetMapping("/index")
	public String home() {
		return "index";
	}
	
	@GetMapping("/basictable")
	public String getBasicTable() {
		return "basic_table";
	}
	
	@GetMapping("/buttons")
	public String getButtons() {
		return "buttons";
	}
	
	@GetMapping("/component")
	public String getComponents() {
		return "form_component";
	}
	
	@GetMapping("/charts")
	public String getCharts() {
		return "chart-charts";
	}

	@GetMapping("/form-validation")
	public String getformValidation() {
		return "form_validation";
	}
	
	@GetMapping("/general")
	public String getGeneral() {
		return "general";
	}
	
	@GetMapping("/grids")
	public String getGrids() {
		return "grids";
	}
	
	@GetMapping("/login")
	public String getlogin() {
		return "login";
	}
	
	@GetMapping("/profile")
	public String getprofile() {
		return "profile";
	}
	
	@GetMapping("/widgets")
	public String getwidgets() {
		return "widgets";
	}
}
