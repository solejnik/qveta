package com.capgemini.solejnik.qveta.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.capgemini.solejnik.qveta.entity.UserEntity;

@Repository
public interface UserRepository extends JpaRepository<UserEntity, Long> {

	@Query("select user from UserEntity user where (user.email = :email) and (user.password = :password)")
	public UserEntity getUserByEmailAndPassword(@Param("email") String email, @Param("password") String password);
}
