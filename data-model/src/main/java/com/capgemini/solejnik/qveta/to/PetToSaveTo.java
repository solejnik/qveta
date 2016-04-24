package com.capgemini.solejnik.qveta.to;

import java.util.Date;

public class PetToSaveTo {
	private Long id;
	private String name;
	private PetTypeTo type;
	private Date bornDate;

	public PetToSaveTo() {
	}

	public PetToSaveTo(Long id, String name, PetTypeTo type, Date bornDate) {
		this.id = id;
		this.name = name;
		this.type = type;
		this.bornDate = bornDate;
	}

	public PetToSaveTo(String name, PetTypeTo type, Date bornDate) {
		this.name = name;
		this.type = type;
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

	public Date getBornDate() {
		return bornDate;
	}

	public void setBornDate(Date bornDate) {
		this.bornDate = bornDate;
	}
}
