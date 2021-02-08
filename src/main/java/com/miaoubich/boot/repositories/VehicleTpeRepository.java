package com.miaoubich.boot.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.miaoubich.boot.models.VehicleType;

@Repository
public interface VehicleTpeRepository extends JpaRepository<VehicleType, Integer> {

}
