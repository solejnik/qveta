package com.capgemini.solejnik.qveta.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Service;

import com.capgemini.solejnik.qveta.entity.UserEntity;

@Service
public interface UserRepository extends JpaRepository<UserEntity, Long> {

}
