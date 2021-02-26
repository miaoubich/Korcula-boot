package com.miaoubich.boot.controllers;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

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

	@PostMapping("/country/addNew")
	public String addNew(Country country) {
		countryService.saveCountry(country);
		return "redirect:/countries";
	}

	@RequestMapping("/country/findById")
	@ResponseBody
	public Optional<Country> findCountryById(int id) {
		return countryService.getCountryById(id);
	}

	@RequestMapping(value = "/country/update", method = { RequestMethod.PUT, RequestMethod.GET })
	public String updateCountry(Country country) {
		countryService.saveCountry(country);
		return "redirect:/countries";
	}
	
	@RequestMapping(value="/country/delete", method= {RequestMethod.DELETE, RequestMethod.GET})
	public String deleteCountry(Integer id) {
		countryService.delete(id);
		return "redirect:/countries";
	}
}
