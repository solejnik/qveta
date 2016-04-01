package com.capgemini.solejnik.qveta.to;

import java.util.HashSet;
import java.util.Set;

public class ClinicTo {
	private Long id;
	private String name;
	private String address;
	private CityTo city;
	private Set<CabinetTo> cabinets = new HashSet<CabinetTo>();

	public ClinicTo() {
	}

	public ClinicTo(String name, CityTo city, String address) {
		this.name = name;
		this.city = city;
		this.address = address;
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

	public CityTo getCity() {
		return city;
	}

	public void setCity(CityTo city) {
		this.city = city;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public Set<CabinetTo> getCabinets() {
		return cabinets;
	}

	public void setCabinets(Set<CabinetTo> cabinets) {
		this.cabinets = cabinets;
	}

}
