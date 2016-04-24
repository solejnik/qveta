package com.capgemini.solejnik.qveta.entity;

import java.util.HashSet;
import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name = "PET_TYPE")
public class PetTypeEntity {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	@Column(nullable = false)
	private String name;

	@OneToMany(mappedBy = "type", cascade = CascadeType.ALL)
	private Set<PetEntity> pets = new HashSet<PetEntity>();

	public PetTypeEntity() {
	}

	public PetTypeEntity(Long id, String name) {
		this.id = id;
		this.name = name;
	}

	public PetTypeEntity(String name) {
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

	public Set<PetEntity> getPets() {
		return pets;
	}

	public void setPets(Set<PetEntity> pets) {
		this.pets = pets;
	}

}
