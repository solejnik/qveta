package com.capgemini.solejnik.qveta.controller;

import java.util.Set;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.capgemini.solejnik.qveta.service.PetTypeService;
import com.capgemini.solejnik.qveta.to.PetTypeTo;

@RestController
public class PetTypeRestService {
	@Autowired
	private PetTypeService petTypeService;

	
	@RequestMapping(value = "/getPetTypes", method = RequestMethod.GET)
	public Set<PetTypeTo> getPetTypes() {
		return petTypeService.getAllPetTypes();
	}

}