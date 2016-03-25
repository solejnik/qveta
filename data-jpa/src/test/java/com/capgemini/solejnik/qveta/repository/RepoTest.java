package com.capgemini.solejnik.qveta.repository;

import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertTrue;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.capgemini.solejnik.qveta.entity.CityEntity;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = "classpath:META-INF/application-context.xml")
public class RepoTest {
	@Autowired
	CityRepository repo;

	@Test
	public void test() {
		// given
		CityEntity city = new CityEntity("Kuba");
		// when
		repo.save(city);
		// then
		assertNotNull(repo.findAll());
		assertTrue(repo.findAll().size() > 0);
	}

}
