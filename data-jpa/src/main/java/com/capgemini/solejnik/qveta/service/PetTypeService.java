package com.capgemini.solejnik.qveta.service;

import java.util.Set;

import com.capgemini.solejnik.qveta.to.PetTypeTo;

public interface PetTypeService {
	Set<PetTypeTo> getAllPetTypes();
	PetTypeTo getPetTypeByName(String type);
}
