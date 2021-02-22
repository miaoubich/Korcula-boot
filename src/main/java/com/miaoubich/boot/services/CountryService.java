package com.miaoubich.boot.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.miaoubich.boot.repositories.CountryRepository;
import com.miaoubich.boot.models.Country;

@Service
public class CountryService {

	@Autowired
	private CountryRepository countryRepository;
	
	public List<Country> getCountries(){
		return countryRepository.findAll();
	}
	
	public void saveCountry(Country country) {
		countryRepository.save(country);
	}
	
}
