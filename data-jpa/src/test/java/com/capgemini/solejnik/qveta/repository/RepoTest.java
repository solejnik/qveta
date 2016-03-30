package com.capgemini.solejnik.qveta.repository;

import java.util.Date;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.capgemini.solejnik.qveta.entity.CabinetEntity;
import com.capgemini.solejnik.qveta.entity.CallEntity;
import com.capgemini.solejnik.qveta.entity.CityEntity;
import com.capgemini.solejnik.qveta.entity.ClinicEntity;
import com.capgemini.solejnik.qveta.entity.PetEntity;
import com.capgemini.solejnik.qveta.entity.PetTypeEntity;
import com.capgemini.solejnik.qveta.entity.UserEntity;
import com.capgemini.solejnik.qveta.entity.VisitEntity;
import com.capgemini.solejnik.qveta.enums.RoleEnum;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = "classpath:META-INF/application-context.xml")
public class RepoTest {
	@Autowired
	VisitRepository repo;
	

	@Test
	public void test() {
		// given
		CityEntity city = new CityEntity("Poznan");
		ClinicEntity clinic = new ClinicEntity("Marchewkowe Pole", city, "dluga 5");
		CabinetEntity cabinet = new CabinetEntity("pokoj 14", clinic);
//		
		UserEntity user = new UserEntity("Simon", "Olejnik", "szymon@olejnik.com", "123", RoleEnum.ADMIN);
		UserEntity doctor = new UserEntity("Ambrozy", "Kleks", "pan@kleks.pl", "321", RoleEnum.DOCTOR);
		PetTypeEntity pettype = new PetTypeEntity("pies");
		PetEntity pet = new PetEntity("pikus", pettype, user,new Date());
//		
		CallEntity call = new CallEntity(new Date(), new Date(), doctor, cabinet);
//		
		VisitEntity visit = new VisitEntity(call, pet,new Date());
		repo.save(visit);
//		
//		// when
//		repo.save(visit);
//		// then
//		assertNotNull(repo.findAll());
//		assertTrue(repo.findAll().size() > 0);
	}

}
