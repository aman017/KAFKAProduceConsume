package com.kafka.practice.kafkaSampleProject.model;

public class Employee {

	private String name;

	private String companyName;

	private String country;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getCompanyName() {
		return companyName;
	}

	public void setCompanyName(String companyName) {
		this.companyName = companyName;
	}

	public String getCountry() {
		return country;
	}

	public void setCountry(String country) {
		this.country = country;
	}

	public Employee(String name, String companyName, String country) {
		super();
		this.name = name;
		this.companyName = companyName;
		this.country = country;
	}

}
