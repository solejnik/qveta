package com.capgemini.solejnik.qveta.service.impl;

import java.util.HashSet;
import java.util.List;
import java.util.Set;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.capgemini.solejnik.qveta.entity.PetEntity;
import com.capgemini.solejnik.qveta.repository.PetRepository;
import com.capgemini.solejnik.qveta.repository.mapper.PetMapper;
import com.capgemini.solejnik.qveta.service.PetService;
import com.capgemini.solejnik.qveta.to.PetTo;

@Service
public class PetServiceImpl implements PetService {
	@Autowired
	private PetRepository petRepository;

	public void savePet(PetTo petTo) {
		petRepository.save(PetMapper.map(petTo));
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

}
