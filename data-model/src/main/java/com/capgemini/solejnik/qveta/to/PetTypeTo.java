package com.capgemini.solejnik.qveta.to;

import java.util.HashSet;
import java.util.Set;

public class PetTypeTo {
	private Long id;
	private String name;
	private Set<PetTo> pets = new HashSet<PetTo>();

	public PetTypeTo() {
	}

	public PetTypeTo(String name) {
		this.name = name;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Set<PetTo> getPets() {
		return pets;
	}

	public void setPets(Set<PetTo> pets) {
		this.pets = pets;
	}

}
