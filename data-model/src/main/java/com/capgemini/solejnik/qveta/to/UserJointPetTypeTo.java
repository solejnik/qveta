package com.capgemini.solejnik.qveta.to;

public class UserJointPetTypeTo {
	private Long id;
	private Long userId;
	private Long petTypeId;

	public UserJointPetTypeTo() {
	}

	public UserJointPetTypeTo(Long userId, Long petId) {
		this.userId = userId;
		this.petTypeId = petId;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public Long getUserId() {
		return userId;
	}

	public void setUserId(Long userId) {
		this.userId = userId;
	}

	public Long getPetId() {
		return petTypeId;
	}

	public void setPetId(Long petId) {
		this.petTypeId = petId;
	}
}
