package com.capgemini.solejnik.qveta.controller;

import java.util.HashSet;
import java.util.Set;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.capgemini.solejnik.qveta.enums.RoleEnum;
import com.capgemini.solejnik.qveta.service.UserService;
import com.capgemini.solejnik.qveta.to.UserTo;

@RestController
public class SampleRestController {
@Autowired
private UserService userService;
	@RequestMapping("/rest")
	public UserTo helloWorld() {
		UserTo userTo = new UserTo("Simon", "Olejnik", "simon@olejnik.com", "123", RoleEnum.ROLE_ADMIN);
		return userTo;
	}

	@RequestMapping("/rests")
	public Set<UserTo> getRests() {
		UserTo userTo1 = new UserTo("Simon", "Olejnik", "simon@olejnik.com", "123", RoleEnum.ROLE_ADMIN);
		UserTo userTo2 = new UserTo("Ambrozy", "Kleks", "maly@okleks.com", "231", RoleEnum.ROLE_DOCTOR);
		userService.saveUser(userTo1);
		userService.saveUser(userTo1);
		Set<UserTo> users = new HashSet<UserTo>();
		users.add(userTo1);
		users.add(userTo2);
		return users;
	}

}