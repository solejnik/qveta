package com.capgemini.solejnik.qveta.repository.mapper;

import com.capgemini.solejnik.qveta.entity.UserEntity;
import com.capgemini.solejnik.qveta.to.UserTo;

public class UserMapper {
	public static UserEntity map(UserTo userTo) {
		UserEntity userEntity = new UserEntity(userTo.getFirstName(), userTo.getLastName(), userTo.getEmail(),
				userTo.getPassword(), userTo.getRole());
		userEntity.setId(userTo.getId());
		return userEntity;
	}

	public static UserTo map(UserEntity userEntity) {
		UserTo userTo = new UserTo(userEntity.getFirstName(), userEntity.getLastName(), userEntity.getEmail(),
				userEntity.getPassword(), userEntity.getRole());
		userTo.setId(userEntity.getId());
		return userTo;
	}
}
