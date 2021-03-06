package com.miaoubich.boot.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.miaoubich.boot.models.Contact;

@Repository
public interface ContactRepository extends JpaRepository<Contact, Integer> {

}
