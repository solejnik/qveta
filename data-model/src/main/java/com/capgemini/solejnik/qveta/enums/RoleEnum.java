package com.capgemini.solejnik.qveta.enums;

public enum RoleEnum {
	ADMIN("ADMIN"), CLIENT("CLIENT"), DOCTOR("DOCTOR"), RECEPTIONIST("RECEPTIONIST");

	private String role;

	private RoleEnum(String role) {
		this.role = role;
	}

	public String getRole() {
		return role;
	}

	public void setRole(String role) {
		this.role = role;
	}

	public static RoleEnum getRoleEnum(String role) {
		if (role == null) {
			return null;
		}
		for (RoleEnum roleEnum : RoleEnum.values()) {
			if (roleEnum.getRole().equals(role)) {
				return roleEnum;
			}
		}
		return null;
	}

}
