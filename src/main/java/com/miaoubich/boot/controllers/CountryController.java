package com.miaoubich.boot.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

import com.miaoubich.boot.models.Country;
import com.miaoubich.boot.services.CountryService;

@Controller
public class CountryController {

	@Autowired
	private CountryService countryService;
	
	@GetMapping("/countries")
	public String displayCountries(Model model) {
		
		List<Country> countryList = countryService.getCountries();
		model.addAttribute("countries", countryList);
		
		return "country";
	}
	
	@PostMapping("/countries/addNew")
	public String addNew(Country country) {
		countryService.saveCountry(country);
		return "redirect:/countries";
	}
}
