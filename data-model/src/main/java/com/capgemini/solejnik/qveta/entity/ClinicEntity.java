package com.capgemini.solejnik.qveta.entity;

import java.util.HashSet;
import java.util.Set;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;

@Entity
public class ClinicEntity {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	// adres
	private Long id;
	@Column(nullable = false)
	private String name;
	@Column(nullable = false)
	private String address;
	@ManyToOne
	private CityEntity city;
	@OneToMany(mappedBy = "clinic")
	private Set<CabinetEntity> cabinets = new HashSet<CabinetEntity>();

	public ClinicEntity() {
	}

	public ClinicEntity(String name, CityEntity city, String address) {
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

	public CityEntity getCity() {
		return city;
	}

	public void setCity(CityEntity city) {
		this.city = city;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public Set<CabinetEntity> getCabinets() {
		return cabinets;
	}

	public void setCabinets(Set<CabinetEntity> cabinets) {
		this.cabinets = cabinets;
	}

}
