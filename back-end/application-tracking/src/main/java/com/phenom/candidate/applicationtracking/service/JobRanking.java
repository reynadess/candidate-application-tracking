package com.phenom.candidate.applicationtracking.service;

import com.phenom.candidate.applicationtracking.dao.JobsDao;
import com.phenom.candidate.applicationtracking.entities.Candidate;
import com.phenom.candidate.applicationtracking.entities.Job;
import java.util.ArrayList;
import java.util.List;

public class JobRanking {
  public static List<Job> getJobsBasedOnCandidateSkills(Candidate candidate) {
    List<String> candidateSkills = candidate.getSkillset();
    List<Job> jobs = JobsDao.getAllJobs();
    sortJobs(candidate, jobs, 0, jobs.size() - 1);
    return jobs;
  }

  private static void sortJobs(Candidate candidate, List<Job> jobs, int low, int high) {
    if (low >= high) {
      return;
    }
    int mid = ((low + high) / 2);
    sortJobs(candidate, jobs, low, mid);
    sortJobs(candidate, jobs, mid + 1, high);
    mergeJobs(candidate, jobs, low, mid + 1, high);
  }

  private static void mergeJobs(Candidate candidate, List<Job> jobs, int low, int mid, int high) {
    int low1 = low;
    int high1 = mid - 1;
    int low2 = mid;
    List<Job> newJobs = new ArrayList<>();

    while (low1 <= high1 && low2 <= high) {
        int sort = CandidateJobComparator.compare(candidate, jobs.get(low1), jobs.get(low2));
        if (sort == -1) {
          newJobs.add(jobs.get(low1));
          low1 += 1;
        } else {
          newJobs.add(jobs.get(low2));
          low2 += 1;
        }
    }

    while (low1 <= high1) {
      newJobs.add(jobs.get(low1));
      low1 += 1;
    }

    while (low2 <= high) {
      newJobs.add(jobs.get(low2));
      low2 += 1;
    }

    for (Job job: newJobs) {
      jobs.set(low, job);
      low++;
    }
  }

}
