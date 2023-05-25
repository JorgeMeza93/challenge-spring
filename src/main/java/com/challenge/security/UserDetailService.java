package com.challenge.security;

import java.text.MessageFormat;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import com.challenge.models.Client;
import com.challenge.repository.IClientsRepository;

@Service
public class UserDetailService implements UserDetailsService {
	
	@Autowired
	private IClientsRepository clientsrepository;

	@Override
	public UserDetails loadUserByUsername(String email) throws UsernameNotFoundException {
		Client client = clientsrepository.findOneByEmail(email)
			.orElseThrow( () -> new UsernameNotFoundException("El usuario con el email " + email + " no existe")); 
		return new UserDetailsImpl(client);
		
	}
}
