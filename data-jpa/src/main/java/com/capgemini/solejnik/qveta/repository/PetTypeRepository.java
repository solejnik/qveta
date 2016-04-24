package com.capgemini.solejnik.qveta.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.capgemini.solejnik.qveta.entity.PetTypeEntity;

@Repository
public interface PetTypeRepository extends JpaRepository<PetTypeEntity, Long> {
	public PetTypeEntity getByName(String name);
}
