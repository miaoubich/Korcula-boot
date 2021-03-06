package com.miaoubich.boot.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.miaoubich.boot.models.State;
import com.miaoubich.boot.repositories.StateRepository;

@Service
public class StateService {

	@Autowired 
	StateRepository stateRepository;
	
	public List<State> getStates() {
		return stateRepository.findAll();
	}

	public void saveState(State state) {
		stateRepository.save(state);		
	}

	public Optional<State> findById(int id) {
		return stateRepository.findById(id);
	}

	public void deleteState(int id) {
		stateRepository.deleteById(id);
	}

}
