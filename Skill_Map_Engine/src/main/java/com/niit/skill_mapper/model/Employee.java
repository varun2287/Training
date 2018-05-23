package com.niit.skill_mapper.model;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
public class Employee implements Serializable {
@Id
@GeneratedValue(strategy=GenerationType.AUTO)
private int employeeId;
@Column
private String empName;

@Column(name="email",unique=true)
private String empMailId;

@Column
private String empPassword;

@Column
private String empGender;

@Column
private String empStreetNumber;

@Column
private String empCity;

@Column
private String empState;

@Column
private int empContact;

@Column
private String empDob;

@Column
private String empQualification;

@Column
private int empExperience;

@Column
private String empSkills;

@Column
private String empDepartment;

@Column
private String empDesignation;

@Column
private String empRole;

@Column
private String empCertification;

@Column
private boolean isApproved;

@Column
private int numberOfViews;

@Column
private String empSupervisorName;

@Column
private String empImage;

public int getEmployeeId() {
	return employeeId;
}

public void setEmployeeId(int employeeId) {
	this.employeeId = employeeId;
}

public String getEmpName() {
	return empName;
}

public void setEmpName(String empName) {
	this.empName = empName;
}

public String getEmpMailId() {
	return empMailId;
}

public void setEmpMailId(String empMailId) {
	this.empMailId = empMailId;
}

public String getEmpPassword() {
	return empPassword;
}

public void setEmpPassword(String empPassword) {
	this.empPassword = empPassword;
}

public String getEmpGender() {
	return empGender;
}

public void setEmpGender(String empGender) {
	this.empGender = empGender;
}

public String getEmpStreetNumber() {
	return empStreetNumber;
}

public void setEmpStreetNumber(String empStreetNumber) {
	this.empStreetNumber = empStreetNumber;
}

public String getEmpCity() {
	return empCity;
}

public void setEmpCity(String empCity) {
	this.empCity = empCity;
}

public String getEmpState() {
	return empState;
}

public void setEmpState(String empState) {
	this.empState = empState;
}

public int getEmpContact() {
	return empContact;
}

public void setEmpContact(int empContact) {
	this.empContact = empContact;
}

public String getEmpDob() {
	return empDob;
}

public void setEmpDob(String empDob) {
	this.empDob = empDob;
}

public String getEmpQualification() {
	return empQualification;
}

public void setEmpQualification(String empQualification) {
	this.empQualification = empQualification;
}

public int getEmpExperience() {
	return empExperience;
}

public void setEmpExperience(int empExperience) {
	this.empExperience = empExperience;
}

public String getEmpSkills() {
	return empSkills;
}

public void setEmpSkills(String empSkills) {
	this.empSkills = empSkills;
}

public String getEmpDepartment() {
	return empDepartment;
}

public void setEmpDepartment(String empDepartment) {
	this.empDepartment = empDepartment;
}

public String getEmpDesignation() {
	return empDesignation;
}

public void setEmpDesignation(String empDesignation) {
	this.empDesignation = empDesignation;
}

public String getEmpRole() {
	return empRole;
}

public void setEmpRole(String empRole) {
	this.empRole = empRole;
}

public String getEmpCertification() {
	return empCertification;
}

public void setEmpCertification(String empCertification) {
	this.empCertification = empCertification;
}

public boolean isApproved() {
	return isApproved;
}

public void setApproved(boolean isApproved) {
	this.isApproved = isApproved;
}

public int getNumberOfViews() {
	return numberOfViews;
}

public void setNumberOfViews(int numberOfViews) {
	this.numberOfViews = numberOfViews;
}

public String getEmpSupervisorName() {
	return empSupervisorName;
}

public void setEmpSupervisorName(String empSupervisorName) {
	this.empSupervisorName = empSupervisorName;
}

public String getEmpImage() {
	return empImage;
}

public void setEmpImage(String empImage) {
	this.empImage = empImage;
}
}
