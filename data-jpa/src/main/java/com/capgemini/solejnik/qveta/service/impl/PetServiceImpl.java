package com.capgemini.solejnik.qveta.service.impl;

import java.util.HashSet;
import java.util.List;
import java.util.Set;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.capgemini.solejnik.qveta.entity.PetEntity;
import com.capgemini.solejnik.qveta.repository.PetRepository;
import com.capgemini.solejnik.qveta.repository.mapper.PetMapper;
import com.capgemini.solejnik.qveta.repository.mapper.PetTypeMapper;
import com.capgemini.solejnik.qveta.repository.mapper.UserMapper;
import com.capgemini.solejnik.qveta.service.PetService;
import com.capgemini.solejnik.qveta.service.PetTypeService;
import com.capgemini.solejnik.qveta.to.PetTo;
import com.capgemini.solejnik.qveta.to.UserTo;

@Service
public class PetServiceImpl implements PetService {
	@Autowired
	private PetRepository petRepository;
	@Autowired
	private PetTypeService petTypeService;

	public void savePet(PetTo petTo) {
		petRepository.save(PetMapper.map(petTo));
	}

	public void editPet(PetTo petTo) {
		PetEntity petToEdit = petRepository.findOne(petTo.getId());
		petToEdit.setName(petTo.getName());
		petToEdit.setBornDate(petTo.getBornDate());
		petToEdit.setType(PetTypeMapper.map(petTypeService.getPetTypeByName(petTo.getType())));
		petRepository.save(petToEdit);
	}

	public Set<PetTo> getAllPets() {
		List<PetEntity> petEntitySet = petRepository.findAll();
		Set<PetTo> petToSet = new HashSet<PetTo>();
		for (PetEntity petEntity : petEntitySet) {
			petToSet.add(PetMapper.map(petEntity));
		}
		return petToSet;
	}

	public Set<PetTo> getPetsByUsersEmail(String email) {
		Set<PetEntity> petEntitySet = petRepository.getPetsByOwner(email);
		Set<PetTo> petToSet = new HashSet<PetTo>();
		for (PetEntity petEntity : petEntitySet) {
			petToSet.add(PetMapper.map(petEntity));
		}
		return petToSet;
	}

	public void deletePet(Long petId) {
		petRepository.delete(petId);
	}

	public void savePet(PetTo petTo, UserTo currentUser) {
		PetEntity petEntity = PetMapper.map(petTo);
		petEntity.setOwner(UserMapper.map(currentUser));
		petEntity.setType(PetTypeMapper.map(petTypeService.getPetTypeByName(petTo.getType())));
		petRepository.save(petEntity);
	}

}
