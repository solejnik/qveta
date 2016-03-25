package com.capgemini.solejnik.qveta.to;

public class CityTo {
	private Long id;
	private String name;

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

}
