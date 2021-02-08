package com.miaoubich.boot.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.miaoubich.boot.models.State;

@Repository
public interface StateRepository extends JpaRepository<State, Integer> {

}
