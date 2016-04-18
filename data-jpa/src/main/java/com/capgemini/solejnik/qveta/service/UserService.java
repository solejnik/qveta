package com.capgemini.solejnik.qveta.service;

import java.util.Set;

import com.capgemini.solejnik.qveta.to.UserTo;

public interface UserService {
	UserTo getFirst();
	void saveUser(UserTo userTo);
	Set<UserTo> getAllUsers();
	UserTo getUserByEmailAndPassword(String email, String password);
}
