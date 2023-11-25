package com.phenom.candidate.applicationtracking.entities;

import jakarta.persistence.Entity;

//@Entity

public class JobApplication {
	static int ids = 1;
	private int jobApplicationId;
	private int jobId;
	private int candidateId;
	private String status;

	public JobApplication( int jobId, int candidateId, String status) {
		this.jobApplicationId = ids++;
		this.jobId = jobId;
		this.candidateId = candidateId;
		this.status = status;
	}

	public JobApplication() {
	}


	public int getJobApplicationId() {
		return jobApplicationId;
	}

	public void setJobApplicationId(int jobApplicationId) {
		this.jobApplicationId = jobApplicationId;
	}

	public int getJobId() {
		return jobId;
	}

	public void setJobId(int jobId) {
		this.jobId = jobId;
	}

	public int getCandidateId() {
		return candidateId;
	}

	public void setCandidateId(int candidateId) {
		this.candidateId = candidateId;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}
}
