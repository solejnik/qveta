package com.capgemini.solejnik.qveta.entity;

import java.util.HashSet;
import java.util.Set;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;

@Entity
public class CityEntity {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long id;
	@Column(nullable = false)
	private String name;
	@OneToMany(mappedBy = "city")
	private Set<ClinicEntity> clinics = new HashSet<ClinicEntity>();

	public CityEntity() {
	}

	public CityEntity(String name) {
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

	public Set<ClinicEntity> getClinics() {
		return clinics;
	}

	public void setClinics(Set<ClinicEntity> clinics) {
		this.clinics = clinics;
	}

}
