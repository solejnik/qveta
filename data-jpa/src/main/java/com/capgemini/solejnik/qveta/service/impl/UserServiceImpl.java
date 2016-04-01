package com.capgemini.solejnik.qveta.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.capgemini.solejnik.qveta.repository.UserRepository;
import com.capgemini.solejnik.qveta.repository.mapper.UserMapper;
import com.capgemini.solejnik.qveta.service.UserService;
import com.capgemini.solejnik.qveta.to.UserTo;

@Service
public class UserServiceImpl implements UserService {
	@Autowired
	private UserRepository userRepository;

	public UserTo getFirst() {
		return UserMapper.map(userRepository.findAll().get(0));
	}

	public void saveUser(UserTo userTo) {
		userRepository.save(UserMapper.map(userTo));
	}

}
