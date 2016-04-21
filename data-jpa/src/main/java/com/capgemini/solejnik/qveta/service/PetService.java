package com.capgemini.solejnik.qveta.service;

import java.util.Set;

import com.capgemini.solejnik.qveta.to.PetTo;

public interface PetService {
	void savePet(PetTo petTo);
	void deletePet(Long petId);
	Set<PetTo> getAllPets();
	Set<PetTo> getPetsByUsersEmail(String email);
}
