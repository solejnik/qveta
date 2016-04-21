package com.capgemini.solejnik.qveta.to;

import java.util.Date;

public class PetTo {
	private Long id;
	private String name;
	private String type;
	private Date bornDate;

	public PetTo() {
	}

	public PetTo(Long id, String name, PetTypeTo type, Date bornDate) {
		this.id = id;
		this.name = name;
		this.type = type.getName();
		this.bornDate = bornDate;
	}

	public PetTo(String name, PetTypeTo type, Date bornDate) {
		this.name = name;
		this.type = type.getName();
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

	public String getType() {
		return type;
	}

	public void setType(PetTypeTo type) {
		this.type = type.getName();
	}

	public Date getBornDate() {
		return bornDate;
	}

	public void setBornDate(Date bornDate) {
		this.bornDate = bornDate;
	}
}
