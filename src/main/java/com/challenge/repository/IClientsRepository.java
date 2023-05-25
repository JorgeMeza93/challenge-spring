package com.challenge.repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import com.challenge.models.Client;


public interface IClientsRepository extends JpaRepository<Client, Integer>{
	Optional<Client> findOneByEmail(String email);
}
