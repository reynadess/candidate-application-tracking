package com.phenom.candidate.applicationtracking.entities;

import java.util.Arrays;
import java.util.List;

public class Candidate {
	private int id;
	private String name;
	private String location;
	private String role;
	private int compensation;
	double experiance;
	private List<String> skillset;


	public double getExperiance() {
		return experiance;
	}

	public void setExperiance(double experiance) {
		this.experiance = experiance;
	}

	public List<String> getSkillset() {
		return skillset;
	}

	public void setSkillset(List<String> skillset) {
		this.skillset = skillset;
	}

	public Candidate() {
	}

	public Candidate(int id, String name, String location, String role, int compensation, double experiance, List<String> skillset) {
		this.id = id;
		this.name = name;
		this.location = location;
		this.role = role;
		this.compensation = compensation;
		this.skillset = skillset;
	}

	public String getName() {
		return name;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getLocation() {
		return location;
	}

	public void setLocation(String location) {
		this.location = location;
	}

	public String getRole() {
		return role;
	}

	public void setRole(String role) {
		this.role = role;
	}

	public int getCompensation() {
		return compensation;
	}

	public void setCompensation(int compensation) {
		this.compensation = compensation;
	}
}
