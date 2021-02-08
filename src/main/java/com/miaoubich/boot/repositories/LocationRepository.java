package com.miaoubich.boot.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.miaoubich.boot.models.Location;

@Repository
public interface LocationRepository extends JpaRepository<Location, Integer> {

}
