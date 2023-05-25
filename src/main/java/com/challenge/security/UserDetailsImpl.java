package com.challenge.security;

import java.util.Collection;
import java.util.Collections;

import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;

import com.challenge.models.Client;


public class UserDetailsImpl implements UserDetails{
	
	private final Client client;
	
	public UserDetailsImpl(Client client) {
		super();
		this.client = client;
	}
	
	@Override
	public Collection<? extends GrantedAuthority> getAuthorities() {
		return Collections.emptyList();
	}

	@Override
	public String getPassword() {
		return client.getPassword();
	}

	@Override
	public String getUsername() {
		return client.getEmail();
	}

	@Override
	public boolean isAccountNonExpired() {
		return true;
	}

	@Override
	public boolean isAccountNonLocked() {
		return true;
	}

	@Override
	public boolean isCredentialsNonExpired() {

		return true;
	}

	@Override
	public boolean isEnabled() {
		return true;
	}
	public String getNombre() {
		return client.getFirstName() + " " + client.getLastName();
	}
	

}
