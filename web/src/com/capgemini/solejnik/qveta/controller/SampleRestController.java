package com.capgemini.solejnik.qveta.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.capgemini.solejnik.qveta.enums.RoleEnum;
import com.capgemini.solejnik.qveta.to.UserTo;

@RestController
public class SampleRestController {

	@RequestMapping("/rest")
	public UserTo helloWorld() {
		UserTo userTo = new UserTo("Simon", "Olejnik", "simon@olejnik.com", "123", RoleEnum.ADMIN);
		return userTo;
	}

}