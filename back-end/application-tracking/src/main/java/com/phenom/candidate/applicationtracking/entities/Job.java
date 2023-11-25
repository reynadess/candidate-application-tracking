package com.phenom.candidate.applicationtracking.entities;

import jakarta.persistence.Entity;

import java.util.Arrays;
import java.util.List;
@Entity

public class Job {
	private int id;
	private String role;
	private String company;
	private List<String>  skillsRequired;
	private int recruiterId;

	public Job() {
	}


	public Job(int id, String role, String company,int recruiterId, List<String> skillsRequired) {
		this.id = id;
		this.role = role;
		this.company = company;
		this.skillsRequired = skillsRequired;
		this.recruiterId = recruiterId;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getRole() {
		return role;
	}

	public void setRole(String role) {
		this.role = role;
	}

	public String getCompany() {
		return company;
	}

	public void setCompany(String company) {
		this.company = company;
	}

	public List<String> getSkillsRequired() {
		return skillsRequired;
	}

	public void setSkillsRequired(List<String> skillsRequired) {
		this.skillsRequired = skillsRequired;
	}

	public int getRecruiterId() {
		return recruiterId;
	}

	public void setRecruiterId(int recruiterId) {
		this.recruiterId = recruiterId;
	}
}
