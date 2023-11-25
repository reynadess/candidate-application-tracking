package com.phenom.candidate.applicationtracking.service;

import static org.junit.jupiter.api.Assertions.fail;

import com.phenom.candidate.applicationtracking.dao.JobsDao;
import com.phenom.candidate.applicationtracking.entities.Candidate;
import com.phenom.candidate.applicationtracking.entities.Job;
import java.util.Arrays;
import java.util.List;
import org.junit.jupiter.api.Test;

public class JobRankingTest {
  @Test
  public void givenCandidate_thenReturnBestJobsForCandidate() {
    Candidate fallBackCandidate = new Candidate(1, "Chaitanya", "Hyderabad", "Software Engineer", 1200000, 3.5, Arrays.asList("1", "2", "3", "4", "5"));
    Candidate candidate = JobsDao.getAllCandidates().stream().findAny().orElse(fallBackCandidate);
    List<Job> jobs = JobRanking.getJobsBasedOnCandidateSkills(candidate);
    for (int idx = 0; idx < jobs.size() - 1; idx++) {
      Job job = jobs.get(idx);
      Job nextJob = jobs.get(idx + 1);
      if (CandidateJobComparator.compare(candidate, job, nextJob) == 1) {
        fail("Something wrong in sorting logic");
      }
    }
  }
}
