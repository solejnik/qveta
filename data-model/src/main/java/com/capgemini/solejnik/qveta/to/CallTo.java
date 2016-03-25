package com.capgemini.solejnik.qveta.to;

import java.util.Date;

public class CallTo {
	private Long id;
	private Date timeFrom;
	private Date timeTo;
	private DoctorTo doctor;
	private CityTo city;
	private CabinetTo cabinet;

	public CallTo() {
	}

	public CallTo(Date timeFrom, Date timeTo, DoctorTo doctor, CityTo city, CabinetTo cabinet) {
		this.timeFrom = timeFrom;
		this.timeTo = timeTo;
		this.doctor = doctor;
		this.city = city;
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

	public DoctorTo getDoctor() {
		return doctor;
	}

	public void setDoctor(DoctorTo doctor) {
		this.doctor = doctor;
	}

	public CityTo getCity() {
		return city;
	}

	public void setCity(CityTo city) {
		this.city = city;
	}

	public CabinetTo getCabinet() {
		return cabinet;
	}

	public void setCabinet(CabinetTo cabinet) {
		this.cabinet = cabinet;
	}

}
