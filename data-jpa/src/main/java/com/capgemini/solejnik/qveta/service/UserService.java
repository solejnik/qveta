package com.capgemini.solejnik.qveta.service;

import com.capgemini.solejnik.qveta.to.UserTo;

public interface UserService {
	UserTo getFirst();
	void saveUser(UserTo userTo);
}
