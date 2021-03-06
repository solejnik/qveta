package com.capgemini.solejnik.qveta.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.capgemini.solejnik.qveta.enums.RoleEnum;
import com.capgemini.solejnik.qveta.service.UserService;
import com.capgemini.solejnik.qveta.to.UserTo;

@RestController
public class RegisterRestService {
	@Autowired
	private UserService userService;

	@RequestMapping(value = "/register", method = RequestMethod.POST)
	public void register(@RequestBody UserTo userTo) {
		if (userTo != null && userTo.getRole() == null) {
			userTo.setRole(RoleEnum.ROLE_CLIENT);
			userService.saveUser(userTo);
		}
	}
	
	@RequestMapping(value = "/currentUsersRole", method = RequestMethod.GET)
	private boolean getCurrentUsersRole() {
		Authentication auth = SecurityContextHolder.getContext().getAuthentication();
		String usersRole = auth.getAuthorities().toString();
		boolean isAnonymous = usersRole.contains("ANONYMOUS");
		return isAnonymous;
	}

}