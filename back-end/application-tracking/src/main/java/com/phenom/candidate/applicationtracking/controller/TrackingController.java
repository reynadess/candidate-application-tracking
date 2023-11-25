package com.phenom.candidate.applicationtracking.controller;

import com.phenom.candidate.applicationtracking.entities.Job;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController("/searches")
public class TrackingController {

	@GetMapping("/getTopJobsForCandidate")
	public List<Job> getTopJobs(){
		List<Job> jobs = new ArrayList<>();

		return  jobs;
	}
}
