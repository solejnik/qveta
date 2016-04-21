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

import com.capgemini.solejnik.qveta.enums.RoleEnum;
import com.capgemini.solejnik.qveta.service.PetService;
import com.capgemini.solejnik.qveta.service.UserService;
import com.capgemini.solejnik.qveta.to.UserTo;
import com.capgemini.solejnik.qveta.to.PetTo;

@RestController
public class MyRestController {
	@Autowired
	private UserService userService;
	@Autowired
	private PetService petService;

	@RequestMapping(value = "/register", method = RequestMethod.POST)
	public void register(@RequestBody UserTo userTo) {
		if (userTo != null && userTo.getRole() == null) {
			userTo.setRole(RoleEnum.ROLE_CLIENT);
			userService.saveUser(userTo);
		}
	}

	@RequestMapping(value = "/getPets", method = RequestMethod.GET, headers = "Accept=application/json")
	public Set<PetTo> getAllPets() {
		Authentication auth = SecurityContextHolder.getContext().getAuthentication();
		String usersEmail = auth.getName();
		Set<PetTo> petsByUsersEmail = petService.getPetsByUsersEmail(usersEmail);
		return petsByUsersEmail;
	}
	
	@RequestMapping(value = "/pet/{id}", method = RequestMethod.DELETE)
    public void deleteBook(@PathVariable("id") Long id) {
        petService.deletePet(id);
    }

}