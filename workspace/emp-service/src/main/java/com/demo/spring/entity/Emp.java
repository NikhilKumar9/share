package com.demo.spring.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.xml.bind.annotation.XmlRootElement;


@Entity
@Table(name="EMP")
@XmlRootElement
public class Emp {
	@Id
	@Column(name="EMPNO")
	private int id;
	
	private String name;
	
	@Column(name="ADDRESS")
	private String city;
	
	private double salary;

	public Emp() {
		// TODO Auto-generated constructor stub
	}

	public Emp(int id, String name, String city, double salary) {
		this.id = id;
		this.name = name;
		this.city = city;
		this.salary = salary;
	}

	

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public double getSalary() {
		return salary;
	}

	public void setSalary(double salary) {
		this.salary = salary;
	}

}
