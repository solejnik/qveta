package com.capgemini.solejnik.qveta.entity;

import java.util.Date;
import java.util.HashSet;
import java.util.Set;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;

@Entity
public class CallEntity {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long id;
	@Column(nullable = false)
	private Date timeFrom;
	@Column(nullable = false)
	private Date timeTo;
	@ManyToOne
	private UserEntity doctor;
	@ManyToOne
	private CabinetEntity cabinet;
	@OneToMany(mappedBy = "call")
	private Set<VisitEntity> visits = new HashSet<VisitEntity>();

	public CallEntity() {
	}

	public CallEntity(Date timeFrom, Date timeTo, UserEntity doctor, CabinetEntity cabinet) {
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

	public UserEntity getDoctor() {
		return doctor;
	}

	public void setDoctor(UserEntity doctor) {
		this.doctor = doctor;
	}

	public CabinetEntity getCabinet() {
		return cabinet;
	}

	public void setCabinet(CabinetEntity cabinet) {
		this.cabinet = cabinet;
	}

	public Set<VisitEntity> getVisits() {
		return visits;
	}

	public void setVisits(Set<VisitEntity> visits) {
		this.visits = visits;
	}

}
