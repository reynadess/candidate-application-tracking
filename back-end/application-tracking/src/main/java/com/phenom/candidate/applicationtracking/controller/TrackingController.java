package com.phenom.candidate.applicationtracking.controller;

import com.phenom.candidate.applicationtracking.dao.JobsDao;
import com.phenom.candidate.applicationtracking.entities.Candidate;
import com.phenom.candidate.applicationtracking.entities.Job;
import com.phenom.candidate.applicationtracking.entities.JobApplication;
import com.phenom.candidate.applicationtracking.entities.Recruiter;
import com.phenom.candidate.applicationtracking.service.JobRanking;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/searches")
@CrossOrigin
public class TrackingController {

	@GetMapping("/getTopJobsForCandidate") public List<Job> getTopJobs() {
		Candidate candidate = JobsDao.getAllCandidates().getFirst();
		List<Job> jobs = JobRanking.getJobsBasedOnCandidateSkills(candidate);
		return jobs;
	}

	@GetMapping("/getAllJobs") public List<Job> getAllJobs() {
		List<Job> jobs = null;
		jobs = JobsDao.getAllJobs();
		return jobs;
	}

	@GetMapping("/getAllApplications") public List<JobApplication> getAllApplications() {
		List<JobApplication> applications = null;
		applications = JobsDao.getAllJobApplications();
		return applications;
	}

	@GetMapping("/getAllRecruters") public List<Recruiter> getAllRecruiters() {
		List<Recruiter> recruiters = null;
		recruiters = JobsDao.getAllRecruiters();
		return recruiters;
	}

	@GetMapping("/getAllJobApplicationsInAppliedStatus") public List<JobApplication> getAllJobApplicationsInAppliedStatus() {
		List<JobApplication> jobApplications = null;
		jobApplications = JobsDao.getAllJobApplicationsInAppliedStatus();
		return jobApplications;
	}

	@GetMapping("/getAllJobApplicationsInAppliedStatusByJobId/{jobId}")
	public List<JobApplication> getAllJobApplicationsInAppliedStatusByJobId(@PathVariable Integer jobId) {
		List<JobApplication> jobApplications = null;
		jobApplications = JobsDao.getAllJobApplicationsInAppliedStatusByJobId(jobId);
		return jobApplications;
	}

}
