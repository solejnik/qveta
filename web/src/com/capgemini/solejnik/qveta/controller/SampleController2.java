package com.capgemini.solejnik.qveta.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

import com.capgemini.solejnik.qveta.enums.RoleEnum;
import com.capgemini.solejnik.qveta.to.UserTo;

@RestController
public class SampleController2 {

	@RequestMapping("/sampleVisit1")
	public UserTo helloWorld() {
		UserTo userTo = new UserTo("Simon", "Olejnik", "simon@olejnik.com", "123", RoleEnum.ADMIN);
		return userTo;
	}

}