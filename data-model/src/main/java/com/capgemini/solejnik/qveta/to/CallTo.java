package com.capgemini.solejnik.qveta.to;

import java.util.Date;
import java.util.HashSet;
import java.util.Set;

public class CallTo {
	private Long id;
	private Date timeFrom;
	private Date timeTo;
	private UserTo doctor;
	private CabinetTo cabinet;
	private Set<VisitTo> visits = new HashSet<VisitTo>();

	public CallTo() {
	}

	public CallTo(Date timeFrom, Date timeTo, UserTo doctor, CabinetTo cabinet) {
		this.timeFrom = timeFrom;
		this.timeTo = timeTo;
		this.doctor = doctor;
		this.cabinet = cabinet;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public Date getTimeFrom() {
		return timeFrom;
	}

	public void setTimeFrom(Date timeFrom) {
		this.timeFrom = timeFrom;
	}

	public Date getTimeTo() {
		return timeTo;
	}

	public void setTimeTo(Date timeTo) {
		this.timeTo = timeTo;
	}

	public UserTo getDoctor() {
		return doctor;
	}

	public void setDoctor(UserTo doctor) {
		this.doctor = doctor;
	}

	public CabinetTo getCabinet() {
		return cabinet;
	}

	public void setCabinet(CabinetTo cabinet) {
		this.cabinet = cabinet;
	}

	public Set<VisitTo> getVisits() {
		return visits;
	}

	public void setVisits(Set<VisitTo> visits) {
		this.visits = visits;
	}

}
