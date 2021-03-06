package com.capgemini.solejnik.qveta.entity;

import java.util.Date;
import java.util.HashSet;
import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.persistence.UniqueConstraint;

@Entity
@Table(name = "PET", uniqueConstraints = @UniqueConstraint(columnNames = { "name", "owner_id" }) )
public class PetEntity {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	@Column(nullable = false)
	private String name;
	@ManyToOne()
	private PetTypeEntity type;
	@Column(nullable = false)
	private Date bornDate;
	@ManyToOne()
	private UserEntity owner;
	@OneToMany(mappedBy = "pet", cascade = CascadeType.ALL)
	private Set<VisitEntity> visits = new HashSet<VisitEntity>();

	public PetEntity() {
	}

	public PetEntity(String name,  Date bornDate) {
		this.name = name;
		this.bornDate = bornDate;
	}
	
	public PetEntity(String name, PetTypeEntity type, Date bornDate) {
		this.name = name;
		this.type = type;
		this.bornDate = bornDate;
	}

	public PetEntity(String name, PetTypeEntity type, UserEntity owner, Date bornDate) {
		this.name = name;
		this.type = type;
		this.owner = owner;
		this.bornDate = bornDate;
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

	public PetTypeEntity getType() {
		return type;
	}

	public void setType(PetTypeEntity type) {
		this.type = type;
	}

	public UserEntity getOwner() {
		return owner;
	}

	public void setOwner(UserEntity owner) {
		this.owner = owner;
	}

	public Date getBornDate() {
		return bornDate;
	}

	public void setBornDate(Date bornDate) {
		this.bornDate = bornDate;
	}

	public Set<VisitEntity> getVisits() {
		return visits;
	}

	public void setVisits(Set<VisitEntity> visits) {
		this.visits = visits;
	}

}
