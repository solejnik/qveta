package com.capgemini.solejnik.qveta.repository.mapper;

import com.capgemini.solejnik.qveta.entity.PetEntity;
import com.capgemini.solejnik.qveta.to.PetTo;
import com.capgemini.solejnik.qveta.to.PetToSaveTo;

public class PetMapper {
	public static PetEntity map(PetTo petTo) {
		PetEntity petEntity = new PetEntity(petTo.getName(), petTo.getBornDate());
		return petEntity;
	}

	public static PetTo map(PetEntity petEntity) {
		PetTo petTo = new PetTo(petEntity.getId(), petEntity.getName(), PetTypeMapper.map(petEntity.getType()),
				petEntity.getBornDate());
		return petTo;
	}
	
	public static PetEntity map(PetToSaveTo petToSaveTo){
		PetEntity petEntity = new PetEntity(petToSaveTo.getName(), PetTypeMapper.map(petToSaveTo.getType()), petToSaveTo.getBornDate());
		return petEntity;
	}
}
