package com.capgemini.solejnik.qveta.to;

import com.capgemini.solejnik.qveta.enums.RoleEnum;

public class UserTo {
	private Long id;
	private String firstName;
	private String lastName;
	private CityTo city;
	private RoleEnum role;

	private String email;
	private String password;

	public UserTo() {
	}

	public UserTo(String firstName, String lastName, CityTo city, String email, String password, RoleEnum role) {
		this.firstName = firstName;
		this.lastName = lastName;
		this.city = city;
		this.email = email;
		this.password = password;
		this.role = role;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
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

	public CityTo getCity() {
		return city;
	}

	public void setCity(CityTo city) {
		this.city = city;
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

	public RoleEnum getRole() {
		return role;
	}

	public void setRole(RoleEnum role) {
		this.role = role;
	}

}
