package com.capgemini.solejnik.qveta.to;

import java.util.HashSet;
import java.util.Set;

public class DoctorTo {
	private Long id;
	private String firstName;
	private String lastName;
	private String email;
	private String password;

	private Set<PetTypeTo> specialties = new HashSet<PetTypeTo>();

	public DoctorTo() {
	}

	public DoctorTo(String firstName, String lastName, String email, String password, Set<PetTypeTo> specialties) {
		this.firstName = firstName;
		this.lastName = lastName;
		this.email = email;
		this.password = password;
		this.specialties = specialties;
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

	public Set<PetTypeTo> getSpecialties() {
		return specialties;
	}

	public void setSpecialties(Set<PetTypeTo> specialties) {
		this.specialties = specialties;
	}

}
