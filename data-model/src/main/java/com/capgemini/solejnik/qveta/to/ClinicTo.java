package com.capgemini.solejnik.qveta.to;

public class ClinicTo {
	private Long id;
	private String name;
	private CityTo city;

	public ClinicTo() {
	}

	public ClinicTo(String name, CityTo city) {
		this.name = name;
		this.city = city;
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

}
