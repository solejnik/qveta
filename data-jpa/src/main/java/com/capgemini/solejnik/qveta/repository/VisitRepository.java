package com.capgemini.solejnik.qveta.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;

import com.capgemini.solejnik.qveta.entity.VisitEntity;
@Service
public interface VisitRepository extends JpaRepository<VisitEntity, Long> {

}
