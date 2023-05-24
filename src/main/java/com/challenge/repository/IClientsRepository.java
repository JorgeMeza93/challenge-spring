package com.challenge.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.challenge.models.Client;


public interface IClientsRepository extends JpaRepository<Client, Integer>{

}
