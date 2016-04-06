package com.capgemini.solejnik.qveta.service;

import static org.junit.Assert.*;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.capgemini.solejnik.qveta.enums.RoleEnum;
import com.capgemini.solejnik.qveta.service.UserService;
import com.capgemini.solejnik.qveta.to.UserTo;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = "classpath:config/service/services-test.xml")

public class UserServiceTest {
	@Autowired
	private UserService userService;

	@Test
	public void test() {
		UserTo userTo = new UserTo("Simon", "Olejnik", "simon@simon.com", "123", RoleEnum.ADMIN);
		userService.saveUser(userTo);
		UserTo first = userService.getFirst();
		assertNotNull(first);
	}

}