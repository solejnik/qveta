package com.capgemini.solejnik.qveta.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class AuthenticationController {

	@RequestMapping("/login")
	public ModelAndView login() {
		return new ModelAndView("login", "message", "There is a login page");
	}
	@RequestMapping("/defaultPage")
	public ModelAndView defaultPage() {
		return new ModelAndView("defaultPage", "message", "There is a default page");
	}
	@RequestMapping("/loginFailure")
	public ModelAndView loginFailure() {
		return new ModelAndView("loginFailure", "message", "Login failure!!!");
	}
	@RequestMapping("/logoutSuccess")
	public ModelAndView logoutSuccess() {
		return new ModelAndView("logoutSuccess", "message", "Logout success");
	}
	@RequestMapping("/error403")
	public ModelAndView error403() {
		return new ModelAndView("403", "message", "Logout success");
	}
}