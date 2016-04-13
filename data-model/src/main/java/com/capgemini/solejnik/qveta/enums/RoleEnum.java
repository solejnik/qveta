package com.capgemini.solejnik.qveta.enums;

public enum RoleEnum {
	ROLE_ADMIN("ROLE_ADMIN"), ROLE_CLIENT("ROLE_CLIENT"), ROLE_DOCTOR("ROLE_DOCTOR"), ROLE_RECEPTIONIST("ROLE_RECEPTIONIST");

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
