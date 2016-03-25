package com.capgemini.solejnik.qveta.to;

public class CabinetTo {
	private Long id;
	private String name;
	private ClinicTo clinic;

	public CabinetTo() {
	}

	public CabinetTo(String name, ClinicTo clinic) {
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

	public ClinicTo getClinic() {
		return clinic;
	}

	public void setClinic(ClinicTo clinic) {
		this.clinic = clinic;
	}

}
