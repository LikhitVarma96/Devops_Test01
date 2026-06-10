package com.slokam.da.hc.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;

import com.fasterxml.jackson.annotation.JsonIgnore;

@Entity
public class AadharCard {

	@Id
	@GeneratedValue
	private Integer id;
	private Long aadhar;
	
	@OneToOne
	@JoinColumn(name="pid")
	@JsonIgnore
	private Patient patient;
	
	
	
	public Patient getPatient() {
		return patient;
	}
	public void setPatient(Patient patient) {
		this.patient = patient;
	}
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public Long getAadhar() {
		return aadhar;
	}
	public void setAadhar(Long aadhar) {
		this.aadhar = aadhar;
	}
	
	
}
