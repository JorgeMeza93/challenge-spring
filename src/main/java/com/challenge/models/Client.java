package com.challenge.models;



import java.math.BigDecimal;
import java.time.LocalDate;
import java.util.Date;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;

@Entity
@Table(name="clients")
public class Client {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name="idClients")
	private Integer id;
	@NotBlank(message = "The field name is mandatory")
	@NotNull(message = "Name is a required field")
	@Column(name="first_name")
	private String firstName;
	@NotBlank(message = "The field name is mandatory")
	@NotNull(message = "Name is a required field")
	@Column(name="first_name")
	private String lastName;
	@Email
	@NotBlank(message = "Email is a required field")
	@NotNull(message = "email is a required field")
	@Column(name="email")
	private String email;
	@NotBlank
	@NotNull
	@Size(min = 10, max=25, message = "Password must be between 10-25 characters")
	private String password;
	@Column(name="date_of_birth")
	@NotNull(message = "Date of birth is a required field")
	private LocalDate dateOfBirthdate;
	@Column(name = "address")
	private String address;
	@Column(name="balance")
	private BigDecimal balance;
	@Column(name="picture")
	private String picture;
	@Column(name="is_active")
	private Boolean isActive;
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public LocalDate getDateOfBirthdate() {
		return dateOfBirthdate;
	}
	public void setDateOfBirthdate(LocalDate dateOfBirthdate) {
		this.dateOfBirthdate = dateOfBirthdate;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public BigDecimal getBalance() {
		return balance;
	}
	public void setBalance(BigDecimal balance) {
		this.balance = balance;
	}
	public String getPicture() {
		return picture;
	}
	public void setPicture(String picture) {
		this.picture = picture;
	}
	public Boolean getIsActive() {
		return isActive;
	}
	public void setIsActive(Boolean isActive) {
		this.isActive = isActive;
	}
	
}
