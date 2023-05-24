package com.challenge.models;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

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
	public ResponseEntity<T>

}
