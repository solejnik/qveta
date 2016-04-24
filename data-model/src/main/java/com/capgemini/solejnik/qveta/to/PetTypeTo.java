package com.capgemini.solejnik.qveta.to;

public class PetTypeTo {
	private Long id;
	private String name;

	public PetTypeTo() {
	}

	public PetTypeTo(Long id, String name) {
		this.id = id;
		this.name = name;
	}

	public PetTypeTo(String name) {
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
