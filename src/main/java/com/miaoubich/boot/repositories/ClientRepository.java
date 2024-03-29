package com.miaoubich.boot.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.miaoubich.boot.models.Client;

@Repository
public interface ClientRepository extends JpaRepository<Client, Integer> {

}
