package com.capgemini.solejnik.qveta.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.capgemini.solejnik.qveta.service.UserService;

@Controller
public class SampleController {
	@Autowired
	private UserService service;

	@RequestMapping("/sampleVisit")
	public ModelAndView helloWorld() {
		Long message = service.getFirst().getId();
		return new ModelAndView("sampleVisit", "message", message);
	}

}