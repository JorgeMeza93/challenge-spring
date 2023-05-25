package com.challenge.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.challenge.models.Client;
import com.challenge.service.IClientService;


@RestController
@RequestMapping("api/clients")
public class ClientController {
	
	@Autowired
	private IClientService clienteService;
	
	@GetMapping
	public ResponseEntity<List<Client>> getClients(){
		return ResponseEntity.ok(clienteService.findAll());
	}
	
	@GetMapping("/{id}")
	public ResponseEntity<Client> getClienteById(@PathVariable("id") Integer id){
		return clienteService.findById(id)
				.map( ResponseEntity::ok)
				.orElseGet( () -> ResponseEntity.notFound().build());
	}
	@PostMapping("/create")
	public ResponseEntity<Client> createNewClient(@RequestBody Client client){
		return new ResponseEntity<>(clienteService.create(client), HttpStatus.CREATED);
	}
	@PutMapping("/{id}")
	public ResponseEntity<Client> updateClient(@RequestBody Client client, @PathVariable("id") Integer id){
		return clienteService.findById(id)
				.map( cli -> ResponseEntity.ok(clienteService.update(client) ))
				.orElseGet(() -> ResponseEntity.notFound().build());
	}
	@DeleteMapping("/{id}")
	public ResponseEntity<Client> deleteClientById(@PathVariable("id") Integer id){
		return clienteService.findById(id)
				.map( cli -> {
						clienteService.delete(id);
						return ResponseEntity.ok(cli); 
						})
				.orElseGet(() -> ResponseEntity.notFound().build());
				 		 		
				
	}
	

}
