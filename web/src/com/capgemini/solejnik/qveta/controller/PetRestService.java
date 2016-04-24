package com.capgemini.solejnik.qveta.controller;

import java.util.Set;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.capgemini.solejnik.qveta.service.PetService;
import com.capgemini.solejnik.qveta.service.UserService;
import com.capgemini.solejnik.qveta.to.PetTo;
import com.capgemini.solejnik.qveta.to.UserTo;

@RestController
public class PetRestService {
	@Autowired
	private UserService userService;
	@Autowired
	private PetService petService;

	@RequestMapping(value = "/getPets", method = RequestMethod.GET)
	public Set<PetTo> getAllPets() {
		String usersEmail = getCurrentUsersEmail();
		Set<PetTo> petsByUsersEmail = petService.getPetsByUsersEmail(usersEmail);
		return petsByUsersEmail;
	}

	@RequestMapping(value = "/pet/{id}", method = RequestMethod.DELETE)
	public Set<PetTo> deleteBook(@PathVariable("id") Long id) {
		petService.deletePet(id);
		String usersEmail = getCurrentUsersEmail();
		Set<PetTo> petsByUsersEmail = petService.getPetsByUsersEmail(usersEmail);
		return petsByUsersEmail;
	}

	@RequestMapping(value = "/editPet", method = RequestMethod.POST)
	public void editPet(@RequestBody PetTo petTo) {
		petService.editPet(petTo);
	}

	@RequestMapping(value = "/savePet", method = RequestMethod.POST)
	public Set<PetTo> savetPet(@RequestBody PetTo petTo) {
		String usersEmail = getCurrentUsersEmail();
		UserTo currentUser = userService.getUserByEmail(usersEmail);
		petService.savePet(petTo, currentUser);
		Set<PetTo> petsAfterAddNewOne = petService.getPetsByUsersEmail(usersEmail);
		return petsAfterAddNewOne;
	}

	private String getCurrentUsersEmail() {
		Authentication auth = SecurityContextHolder.getContext().getAuthentication();
		String usersEmail = auth.getName();
		return usersEmail;
	}

}