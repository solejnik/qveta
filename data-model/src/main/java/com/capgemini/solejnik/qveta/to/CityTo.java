package com.capgemini.solejnik.qveta.to;

import java.util.HashSet;
import java.util.Set;

public class CityTo {
	private Long id;
	private String name;
	private Set<ClinicTo> clinics = new HashSet<ClinicTo>();

	public CityTo() {
	}

	public CityTo(String name) {
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

	public Set<ClinicTo> getClinics() {
		return clinics;
	}

	public void setClinics(Set<ClinicTo> clinics) {
		this.clinics = clinics;
	}

}
