package com.capgemini.solejnik.qveta.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.capgemini.solejnik.qveta.entity.CityEntity;
@Repository
public interface CityRepository extends JpaRepository<CityEntity, Long> {

}
