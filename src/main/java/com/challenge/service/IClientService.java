package com.challenge.service;

import java.util.List;
import java.util.Optional;

import com.challenge.models.Client;


public interface IClientService {
	
	List<Client> findAll();
	Optional<Client> findById(Integer id);
	Client create(Client client);
	Client update(Client client);
	void delete(Integer id);
}


