package com.capgemini.solejnik.qveta.service;

import java.util.Set;

import com.capgemini.solejnik.qveta.to.PetTo;

public interface PetService {
	void savePet(PetTo petTo);
	Set<PetTo> getAllPets();
	Set<PetTo> getPetsByUsersEmail(String email);
}
