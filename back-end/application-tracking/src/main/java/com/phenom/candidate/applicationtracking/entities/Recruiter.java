package com.phenom.candidate.applicationtracking.entities;

import jakarta.persistence.Entity;

@Entity

public class Recruiter {
	private int id;
	private String name;
	private String company;

	public Recruiter() {
	}

	public Recruiter(int id, String name, String company) {
		this.id = id;
		this.name = name;
		this.company = company;
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

	public String getCompany() {
		return company;
	}

	public void setCompany(String company) {
		this.company = company;
	}
}
