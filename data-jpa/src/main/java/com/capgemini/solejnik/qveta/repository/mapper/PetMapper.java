package com.capgemini.solejnik.qveta.repository.mapper;

import com.capgemini.solejnik.qveta.entity.PetEntity;
import com.capgemini.solejnik.qveta.to.PetTo;

public class PetMapper {
	public static PetEntity map(PetTo petTo) {
		PetEntity petEntity = new PetEntity(petTo.getName(), PetTypeMapper.map(petTo.getType()),
				UserMapper.map(petTo.getOwner()), petTo.getBornDate());
		return petEntity;
	}

	public static PetTo map(PetEntity petEntity) {
		PetTo petTo = new PetTo(petEntity.getName(), PetTypeMapper.map(petEntity.getType()),
				UserMapper.map(petEntity.getOwner()), petEntity.getBornDate());
		return petTo;
	}
}