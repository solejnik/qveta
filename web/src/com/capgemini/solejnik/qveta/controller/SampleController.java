package com.capgemini.solejnik.qveta.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.capgemini.solejnik.qveta.service.VisitService;

@Controller
public class SampleController {
	@Autowired
	private VisitService service;

	@RequestMapping("/sampleVisit")
	public ModelAndView helloWorld() {
		String message = service.getFirstEntity();
		return new ModelAndView("sampleVisit", "message", message);
	}

}