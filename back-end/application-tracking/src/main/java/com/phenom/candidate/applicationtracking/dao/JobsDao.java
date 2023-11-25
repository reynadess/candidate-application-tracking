package com.phenom.candidate.applicationtracking.dao;

import com.phenom.candidate.applicationtracking.entities.Candidate;
import com.phenom.candidate.applicationtracking.entities.Job;
import com.phenom.candidate.applicationtracking.entities.JobApplication;
import com.phenom.candidate.applicationtracking.entities.Recruiter;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class JobsDao {

	public static List<Candidate> getAllCandidates() {
		List<Candidate> candidates = new ArrayList<>();
		candidates.add(new Candidate(1, "Chaitanya", "Hyderabad", "Software Engineer", 1200000, 3.5, Arrays.asList("1", "2", "3", "4", "5")));

		candidates.add(new Candidate(2, "Tagore", "Hyderabad", "Sr.Software Engineer", 1400000, 3.9, Arrays.asList("3", "4", "6")));

		candidates.add(new Candidate(3, "Nikhil", "Bangalore", "Trainee Engineer", 800000, 2, Arrays.asList("2", "3", "6")));

		candidates.add(new Candidate(4, "Govind", "Pune", "Lead Engineer", 1300000, 5.5, Arrays.asList("2", "3")));

		candidates.add(new Candidate(5, "Murali", "Hyderabad", "Sr.Software Engineer", 1300000, 3.4, Arrays.asList("4", "5")));
		return candidates;
	}

	public static List<Job> getAllJobs() {
		List<Job> jobs = new ArrayList<>();
		jobs.add(new Job(1, "Developer", "Phenom", 1, Arrays.asList("1", "2", "3")));
		jobs.add(new Job(2, "Developer", "Deloitte", 2, Arrays.asList("4", "5", "6")));
		jobs.add(new Job(3, "Developer", "IVY", 3, Arrays.asList("1", "2")));
		jobs.add(new Job(4, "Developer", "LLOYDS", 4, Arrays.asList("3", "5")));
		jobs.add(new Job(5, "Developer", "Audintel", 5, Arrays.asList("2", "4", "7")));
		return jobs;
	}

	public static List<Recruiter> getAllRecruiters(){
		List<Recruiter> recruiters = new ArrayList<>();
		recruiters.add(new Recruiter(1,"Satya","MorganChase"));
		recruiters.add(new Recruiter(2,"Satya","WellsFargo"));
		recruiters.add(new Recruiter(3,"Satya","ValueLabs"));
		recruiters.add(new Recruiter(4,"Satya","TCS"));
		recruiters.add(new Recruiter(5,"Satya","Infy"));
		return recruiters;

	}

	public static List<JobApplication> getAllJobApplications() {
		List<JobApplication> applications = new ArrayList<>();
		applications.add(new JobApplication(1, 2, "APPLIED"));
		applications.add(new JobApplication(2, 2, "APPLIED"));
		applications.add(new JobApplication(1, 3, "INPROC"));
		applications.add(new JobApplication(2, 4, "APPLIED"));
		applications.add(new JobApplication(2, 5, "APPLIED"));
		applications.add(new JobApplication(5, 1, "DORMANT"));
		applications.add(new JobApplication(5, 2, "APPLIED"));
		applications.add(new JobApplication(3, 2, "APPLIED"));
		applications.add(new JobApplication(4, 2, "APPLIED"));
		applications.add(new JobApplication(3, 3, "REJECTED"));
		return applications;
	}

	public static List<JobApplication> getAllJobApplicationsInAppliedStatus() {
		return getAllJobApplications().stream().filter(x -> "APPLIED".equals(x.getStatus())).collect(Collectors.toList());
	}
	public static List<JobApplication> getAllJobApplicationsInAppliedStatusByJobId(int jobId) {
		return getAllJobApplications().stream().filter(x -> "APPLIED".equals(x.getStatus()) && x.getJobId() == jobId).collect(Collectors.toList());
	}
	public static List<JobApplication> getAllJobApplicationsInAppliedStatusByCandidateId(int candidateId) {
		return getAllJobApplications().stream().filter(x -> "APPLIED".equals(x.getStatus()) && x.getCandidateId() == candidateId).collect(Collectors.toList());
	}
}
