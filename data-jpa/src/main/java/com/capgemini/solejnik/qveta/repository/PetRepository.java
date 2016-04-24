package com.capgemini.solejnik.qveta.repository;

import java.util.Set;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.capgemini.solejnik.qveta.entity.PetEntity;

@Repository
public interface PetRepository extends JpaRepository<PetEntity, Long> {
	@Query("select pet from PetEntity pet where pet.owner.email = :email")
	public Set<PetEntity> getPetsByOwner(@Param("email") String email);
}
