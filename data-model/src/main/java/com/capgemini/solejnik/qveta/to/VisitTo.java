package com.capgemini.solejnik.qveta.to;

import java.util.Date;

import com.capgemini.solejnik.qveta.enums.VisitStatusEnum;

public class VisitTo {
	private Long id;
	private CallTo call;
	private PetTo pet;
	private Date beginTime;
	private Date endTine;
	private String recognition;
	private String courseOfTreatment;
	private VisitStatusEnum status;

	public VisitTo() {
	}

	public VisitTo(CallTo call, PetTo pet) {
		super();
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

	public CallTo getCall() {
		return call;
	}

	public void setCall(CallTo call) {
		this.call = call;
	}

	public PetTo getPet() {
		return pet;
	}

	public void setPet(PetTo pet) {
		this.pet = pet;
	}

	public Date getBeginTime() {
		return beginTime;
	}

	public void setBeginTime(Date beginTime) {
		this.beginTime = beginTime;
	}

	public Date getEndTine() {
		return endTine;
	}

	public void setEndTine(Date endTine) {
		this.endTine = endTine;
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

}
