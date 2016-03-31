package com.capgemini.solejnik.qveta.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.capgemini.solejnik.qveta.repository.VisitRepository;

@Service
public class VisitService {
	@Autowired
	private VisitRepository repo;

	public String getFirstEntity() {
		return "asdsa";//repo.findAll().get(0).getPet().getName();
	}
}
