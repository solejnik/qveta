package com.capgemini.solejnik.qveta.repository;

import static org.junit.Assert.assertNotNull;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.capgemini.solejnik.qveta.entity.UserEntity;
import com.capgemini.solejnik.qveta.enums.RoleEnum;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = "classpath:config/repository/repositories-test.xml")
public class UserRepositoryTest {
	@Autowired
	private UserRepository userRepository;

	@Test
	public void test() {
		UserEntity userEntity = new UserEntity("Simon", "Olejnik", "simon@olejnik.com", "123", RoleEnum.ADMIN);
		userRepository.save(userEntity);
		UserEntity one = userRepository.findAll().get(0);
		assertNotNull(one);
	}

}
