package com.capgemini.solejnik.qveta.repository.mapper;

import com.capgemini.solejnik.qveta.entity.PetTypeEntity;
import com.capgemini.solejnik.qveta.to.PetTypeTo;

public class PetTypeMapper {
	public static PetTypeEntity map(PetTypeTo petTypeTo) {
		PetTypeEntity petTypeEntity = new PetTypeEntity(petTypeTo.getName());
		return petTypeEntity;
	}

	public static PetTypeTo map(PetTypeEntity petTypeEntity) {
		PetTypeTo petTypeTo = new PetTypeTo(petTypeEntity.getName());
		return petTypeTo;
	}
}
