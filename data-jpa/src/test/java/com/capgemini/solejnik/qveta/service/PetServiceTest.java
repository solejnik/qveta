package com.capgemini.solejnik.qveta.service;

import static org.junit.Assert.assertNotNull;

import java.util.Date;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.capgemini.solejnik.qveta.enums.RoleEnum;
import com.capgemini.solejnik.qveta.to.PetTo;
import com.capgemini.solejnik.qveta.to.PetTypeTo;
import com.capgemini.solejnik.qveta.to.UserTo;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = "classpath:config/service/services-test.xml")

public class PetServiceTest {
	@Autowired
	private PetService petService;

//	@Test
//	public void testShouldSamePet() {
//		PetTypeTo type = new PetTypeTo("Cat");
//		UserTo owner = new UserTo("Anna", "Wanna", "anna@wanna.com", "123", RoleEnum.ROLE_CLIENT);
//		PetTo petTo = new PetTo("Faza", type, owner, new Date());
//		petService.savePet(petTo);
//		assertNotNull(123);
//	}
	
	@Test
	public void testShouldGetPetsByOwner() {
		petService.getPetsByUsersEmail("anna@wanna.com");
		assertNotNull(123);
	}

}
