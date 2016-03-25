package com.capgemini.solejnik.qveta.entity;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

import com.capgemini.solejnik.qveta.enums.VisitStatusEnum;

@Entity
public class VisitEntity {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long id;
	@ManyToOne
	private CallEntity call;
	@ManyToOne
	private PetEntity pet;
	@Column(nullable = false)
	private Date beginTime;

	private String recognition;
	private String courseOfTreatment;
	private VisitStatusEnum status;

	public VisitEntity() {
	}

	public VisitEntity(CallEntity call, PetEntity pet) {
		this.call = call;
		this.pet = pet;
		this.status = VisitStatusEnum.REGISTERED;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public CallEntity getCall() {
		return call;
	}

	public void setCall(CallEntity call) {
		this.call = call;
	}

	public PetEntity getPet() {
		return pet;
	}

	public void setPet(PetEntity pet) {
		this.pet = pet;
	}

	public Date getBeginTime() {
		return beginTime;
	}

	public void setBeginTime(Date beginTime) {
		this.beginTime = beginTime;
	}

	public String getRecognition() {
		return recognition;
	}

	public void setRecognition(String recognition) {
		this.recognition = recognition;
	}

	public String getCourseOfTreatment() {
		return courseOfTreatment;
	}

	public void setCourseOfTreatment(String courseOfTreatment) {
		this.courseOfTreatment = courseOfTreatment;
	}

	public VisitStatusEnum getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = VisitStatusEnum.getVisitStatusEnum(status);
	}

	public void setStatus(VisitStatusEnum status) {
		this.status = status;
	}

}
