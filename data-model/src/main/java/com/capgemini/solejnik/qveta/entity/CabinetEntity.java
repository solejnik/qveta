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
public class CabinetEntity {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long id;
	@Column(nullable = false, length = 255)
	private String name;
	@ManyToOne
	private ClinicEntity clinic;
	@OneToMany(mappedBy = "cabinet")
	private Set<CallEntity> calls = new HashSet<CallEntity>();

	public CabinetEntity() {
	}

	public CabinetEntity(String name, ClinicEntity clinic) {
		this.name = name;
		this.clinic = clinic;
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

	public ClinicEntity getClinic() {
		return clinic;
	}

	public void setClinic(ClinicEntity clinic) {
		this.clinic = clinic;
	}

	public Set<CallEntity> getCalls() {
		return calls;
	}

	public void setCalls(Set<CallEntity> calls) {
		this.calls = calls;
	}

}
