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
import com.miaoubich.boot.models.State;
import com.miaoubich.boot.services.CountryService;
import com.miaoubich.boot.services.StateService;

@Controller
public class StateController {

	@Autowired
	private StateService stateService;
	@Autowired
	private CountryService countryService;

	@GetMapping("/states")
	public String displayStates(Model model) {
	List<Country> countriesList = countryService.getCountries();
	List<State> statesList = stateService.getStates(); 
	
	model.addAttribute("countries", countriesList);
	model.addAttribute("states", statesList);
		return "state";
	}
	
	@PostMapping("/state/addNew")
	public String addNewState(State state) {
		stateService.saveState(state);
		return "redirect:/states";
	}
	
	@GetMapping("/state/findById")
	@ResponseBody
	public Optional<State> findStateById(int id){
		return stateService.findById(id);
	}
	
	@RequestMapping(value="/state/update", method= {RequestMethod.PUT, RequestMethod.GET})
	public String updateState(State state) {
		stateService.saveState(state);
		return "redirect:/states";
	}
	
	@RequestMapping(value="/state/delete", method= {RequestMethod.DELETE, RequestMethod.GET})
	public String deleteState(int id) {
		stateService.deleteState(id);
		return "redirect:/states";
	}

}
