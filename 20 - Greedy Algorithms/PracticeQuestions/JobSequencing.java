package PracticeQuestions;

import java.util.ArrayList;
import java.util.Collections;

public class JobSequencing {
    static class Job {
        int id; // 1(A), 2(B), 3(C)
        int deadline;
        int profit;

        Job(int i, int d, int p) {
            id = i;
            deadline = d;
            profit = p;
        }
    }

    public static void main(String[] args) {
        // given
        int[][] jobsInfo = { { 4, 20 }, { 1, 10 }, { 1, 40 }, { 1, 30 } }; // {deadline, profit}

        // ArrayList of Jobs of type Job(Class) - It will store Objects of Job
        ArrayList<Job> jobs = new ArrayList<>();

        // Add jobsInfo in jobs Arraylist
        for (int i = 0; i < jobsInfo.length; i++) {
            jobs.add(new Job(i, jobsInfo[i][0], jobsInfo[i][1]));
        }

        // Sort the Objects by profit - lambda
        // descending order - Maximum profit first
        Collections.sort(jobs, (obj1, obj2) -> obj2.profit - obj1.profit);

        int time = 0, profit = 0;
        ArrayList<Integer> ans = new ArrayList<>(); // To store the id of job that is executed

        for (int i = 0; i < jobs.size(); i++) {
            Job curr = jobs.get(i);

            if (curr.deadline > time) {
                time++;
                profit += curr.profit;
                ans.add(curr.id);
            }
        }

        System.out.println(profit);
        System.out.println(ans);
    }
}