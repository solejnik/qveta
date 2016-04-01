package com.capgemini.solejnik.qveta.to;

import java.util.Date;
import java.util.HashSet;
import java.util.Set;

public class PetTo {
	private Long id;
	private String name;
	private PetTypeTo type;
	private Date bornDate;
	private UserTo owner;
	private Set<VisitTo> visits = new HashSet<VisitTo>();

	public PetTo() {
	}

	public PetTo(String name, PetTypeTo type, UserTo owner, Date bornDate) {
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

	public PetTypeTo getType() {
		return type;
	}

	public void setType(PetTypeTo type) {
		this.type = type;
	}

	public UserTo getOwner() {
		return owner;
	}

	public void setOwner(UserTo owner) {
		this.owner = owner;
	}

	public Date getBornDate() {
		return bornDate;
	}

	public void setBornDate(Date bornDate) {
		this.bornDate = bornDate;
	}

	public Set<VisitTo> getVisits() {
		return visits;
	}

	public void setVisits(Set<VisitTo> visits) {
		this.visits = visits;
	}

}
