package com.phenom.candidate.applicationtracking.service;

import com.phenom.candidate.applicationtracking.entities.Candidate;
import com.phenom.candidate.applicationtracking.entities.Job;
import java.util.List;

import java.lang.Math;

public class CandidateJobComparator {


  public static int compare(Candidate candidate, Job j1, Job j2) {
    List<String> candidateSkills = candidate.getSkillset();
    List<String> job1Skills = j1.getSkillsRequired();
    List<String> job2Skills = j2.getSkillsRequired();
    // Candidates best job fit
    int job1FitScore = 0;
    int job2FitScore = 0;
    int currIdx = 0;
    for (int i = job1Skills.size() - 1; i >= 0; i--) {
      if (candidateSkills.contains(job1Skills.get(i))) {
        job1FitScore = (int) Math.pow(2, currIdx);
      }
      currIdx += 1;
    }

    currIdx = 0;
    for (int i = job2Skills.size() - 1; i >= 0; i--) {
      if (candidateSkills.contains(job2Skills.get(i))) {
        job2FitScore = (int) Math.pow(2, currIdx);
      }
      currIdx += 1;
    }

    if (job1FitScore <= job2FitScore) {
      return -1;
    } else {
      return 1;
    }
  }
}
