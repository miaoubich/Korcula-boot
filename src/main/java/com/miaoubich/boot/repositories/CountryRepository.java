package com.miaoubich.boot.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.miaoubich.boot.models.Country;

@Repository
public interface CountryRepository extends JpaRepository<Country, Integer> {

}
