package com.phenom.candidate.applicationtracking.controller;

import com.phenom.candidate.applicationtracking.dao.JobsDao;
import com.phenom.candidate.applicationtracking.entities.Candidate;
import com.phenom.candidate.applicationtracking.entities.Job;
import com.phenom.candidate.applicationtracking.service.JobRanking;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/searches")
public class TrackingController {

	@GetMapping("/getTopJobsForCandidate")
	public List<Job> getTopJobs(){
		Candidate candidate = JobsDao.getAllCandidates().getFirst();
		List<Job> jobs = JobRanking.getJobsBasedOnCandidateSkills(candidate);
		return jobs;
	}
}
