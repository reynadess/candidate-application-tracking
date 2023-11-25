package com.phenom.candidate.applicationtracking.dao;

import com.phenom.candidate.applicationtracking.entities.Candidate;
import com.phenom.candidate.applicationtracking.entities.Job;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class JobsDao {

	public static List<Candidate> getAllCandidates(){
		List<Candidate> candidates = new ArrayList<>();
		candidates.add(new Candidate(1, "Chaitanya", "Hyderabad",
				"Software Engineer", 1200000,3.5, Arrays.asList("Java", "SQL", "Python", "DSA", "Snowflake")));

		candidates.add(new Candidate(1, "Tagore", "Hyderabad",
				"Sr.Software Engineer", 1400000,3.9, Arrays.asList("Java", "SQL", "Python")));

		candidates.add(new Candidate(1, "Nikhil", "Bangalore",
				"Trainee Engineer", 800000,2, Arrays.asList("Python", "DSA", "Snowflake")));

		candidates.add(new Candidate(1, "Govind", "Pune",
				"Lead Engineer", 1300000,5.5, Arrays.asList("Java", "SQL", "DSA", "Snowflake")));

		candidates.add(new Candidate(1, "Murali", "Hyderabad",
				"Sr.Software Engineer", 1300000,3.4, Arrays.asList( "SQL",  "DSA", "Snowflake")));
		return candidates;
	}
	public static  List<Job> getAllJobs(){
		List<Job> jobs = new ArrayList<>();
		jobs.add(new Job(1,"Developer","Phenom", 1,Arrays.asList("DSA", "Java", "Python")));
		jobs.add(new Job(2,"Developer","Deloitte", 2,Arrays.asList( "Java", "Python", "SQL")));
		jobs.add(new Job(3,"Developer","IVY", 3,Arrays.asList("Python", "Microservices")));
		jobs.add(new Job(4,"Developer","LLOYDS", 4,Arrays.asList("DSA",  "Python")));
		jobs.add(new Job(5,"Developer","Audintel", 5,Arrays.asList("DSA", "Snowflake", "Python")));
		return jobs;
	}
}
