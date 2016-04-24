package com.capgemini.solejnik.qveta.service.impl;

import java.util.HashSet;
import java.util.List;
import java.util.Set;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.capgemini.solejnik.qveta.entity.PetTypeEntity;
import com.capgemini.solejnik.qveta.repository.PetTypeRepository;
import com.capgemini.solejnik.qveta.repository.mapper.PetTypeMapper;
import com.capgemini.solejnik.qveta.service.PetTypeService;
import com.capgemini.solejnik.qveta.to.PetTypeTo;

@Service
public class PetTypeServiceImpl implements PetTypeService {
	@Autowired
	private PetTypeRepository petTypeRepository;

	public Set<PetTypeTo> getAllPetTypes() {
		List<PetTypeEntity> allPetTypesList = petTypeRepository.findAll();
		HashSet<PetTypeTo> allPetTypesSet = new HashSet<PetTypeTo>();
		for(PetTypeEntity petTypeEntity:allPetTypesList){
			allPetTypesSet.add(PetTypeMapper.map(petTypeEntity));
		}
		return allPetTypesSet;
	}
	
	public PetTypeTo getPetTypeByName(String typeName){
		return PetTypeMapper.map(petTypeRepository.getByName(typeName));
	}
}
