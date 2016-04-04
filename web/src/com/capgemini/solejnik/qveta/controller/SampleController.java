package com.capgemini.solejnik.qveta.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.capgemini.solejnik.qveta.enums.RoleEnum;
import com.capgemini.solejnik.qveta.service.UserService;
import com.capgemini.solejnik.qveta.to.UserTo;

@Controller
public class SampleController {
	@Autowired
	private UserService service;

	@RequestMapping("/sampleVisit")
	public ModelAndView helloWorld() {
		UserTo userTo = new UserTo("Simon", "Olejnik", "simon@olejnik.com", "123", RoleEnum.ADMIN);
		service.saveUser(userTo);
		return new ModelAndView("sampleUser", "user", userTo);
	}

}