package com.capgemini.solejnik.qveta.service.impl;

import java.util.HashSet;
import java.util.List;
import java.util.Set;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.capgemini.solejnik.qveta.entity.UserEntity;
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

	public Set<UserTo> getAllUsers() {
		List<UserEntity> allUsersEntity = userRepository.findAll();
		Set<UserTo> allUsersTo = new HashSet<UserTo>();

		for (UserEntity userEntity : allUsersEntity) {
			allUsersTo.add(UserMapper.map(userEntity));
		}
		return allUsersTo;
	}

	public UserTo getUserByEmailAndPassword(String email, String password) {
		UserEntity foundUser = userRepository.getUserByEmailAndPassword(email, password);
		if (foundUser != null) {
			return UserMapper.map(foundUser);
		}
		return null;
	}

}
