package com.demo.model;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

import org.hibernate.annotations.GenericGenerator;

@Entity
@Table(name = "Employee")
public class Employee implements Serializable
{
	@Id
	@Column(name = "EmployeeRollno")
	@GenericGenerator(name = "ref",strategy = "increment")
	@GeneratedValue(generator = "ref")
	private int erollno;
	@Column(name = "EmployeeID")
	private int eid;
	@Column(name = "EmployeeName")
	private String ename;
	@Column(name = "EmployeeAge")
	private int eage;
	@Column(name = "Job")
	private String job;
	@Column(name = "Salary")
	private int salary;
	@Column(name = "location")
	private String location;
	
	public Employee() {
		System.out.println("Employee Object Created..");
	}

	public int getErollno() {
		return erollno;
	}



	public void setErollno(int erollno) {
		this.erollno = erollno;
	}



	public int getEid() {
		return eid;
	}

	public void setEid(int eid) {
		this.eid = eid;
	}

	public String getEname() {
		return ename;
	}

	public void setEname(String ename) {
		this.ename = ename;
	}

	public int getEage() {
		return eage;
	}

	public void setEage(int eage) {
		this.eage = eage;
	}

	public String getJob() {
		return job;
	}

	public void setJob(String job) {
		this.job = job;
	}

	public int getSalary() {
		return salary;
	}

	public void setSalary(int salary) {
		this.salary = salary;
	}

	public String getLocation() {
		return location;
	}

	public void setLocation(String location) {
		this.location = location;
	}	
}