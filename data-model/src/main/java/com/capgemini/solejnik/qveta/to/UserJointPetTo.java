package com.capgemini.solejnik.qveta.to;

public class UserJointPetTo {
	private Long id;
	private Long userId;
	private Long petId;

	public UserJointPetTo() {
	}

	public UserJointPetTo(Long userId, Long petId) {
		this.userId = userId;
		this.petId = petId;
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
		return petId;
	}

	public void setPetId(Long petId) {
		this.petId = petId;
	}

}
