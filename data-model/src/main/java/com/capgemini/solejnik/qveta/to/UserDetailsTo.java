package com.capgemini.solejnik.qveta.to;

public class UserDetailsTo {
	private String name;

	public UserDetailsTo() {
		this.name = "Nieznajomy";
	}

	public UserDetailsTo(String firstName, String lastName) {
		this.name = firstName + " " + lastName;
	}

	public UserDetailsTo(UserTo userTo) {
		this();
		if (userTo != null) {
			this.name = userTo.getFirstName() + " " + userTo.getLastName();
		}
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

}
