package com.challenge.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.challenge.models.Client;
import com.challenge.repository.IClientsRepository;

@Service
public class ClientService implements IClientService {

	@Autowired
	private IClientsRepository clientRepository;
	
	@Override
	public List<Client> findAll() {
		return clientRepository.findAll();
	}
	
	@Override
	public Client create(Client client) {
		return clientRepository.save(client);
	}

	@Override
	public Client update(Client client) {
		return clientRepository.save(client);
	}

	@Override
	public void delete(Integer id) {
		clientRepository.deleteById(id);
	}

	@Override
	public Optional<Client> findById(Integer id) {
		return clientRepository.findById(id);
	}
	
}
