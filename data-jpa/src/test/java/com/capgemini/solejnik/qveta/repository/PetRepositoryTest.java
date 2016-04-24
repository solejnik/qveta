package com.capgemini.solejnik.qveta.repository;

import static org.junit.Assert.*;

import java.util.Date;
import java.util.Set;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.capgemini.solejnik.qveta.entity.PetEntity;
import com.capgemini.solejnik.qveta.entity.PetTypeEntity;
import com.capgemini.solejnik.qveta.entity.UserEntity;
import com.capgemini.solejnik.qveta.enums.RoleEnum;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = "classpath:config/repository/repositories-test.xml")
public class PetRepositoryTest {
	@Autowired
	private PetRepository petRepository;
	@Autowired
	private UserRepository userRepository;

	// @Test
	// public void testShouldSavePet() {
	// PetTypeEntity type = new PetTypeEntity("dog");
	// UserEntity owner = new UserEntity("Stefan", "Wielki",
	// "stefan@wielki.com", "123", RoleEnum.ROLE_CLIENT);
	// PetEntity petEntity = new PetEntity("Pikus", type, owner, new Date());
	// petRepository.save(petEntity);
	// assertNotNull(petEntity.getId());
	// }

	@Test
	public void testShouldFindPetsByOwner() {
		petRepository.delete(2L);
	}
//	@Test
//	public void testShouldFindPetsByOwner() {
//		Set<PetEntity> petsByOwner = petRepository.getPetsByOwner("stefan@wielki.com");
//		assertNotNull(petsByOwner);
//	}

}
