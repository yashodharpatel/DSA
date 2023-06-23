package PracticeQuestions;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;

public class ActivitySelection {
    public static void main(String[] args) {
        int start[] = { 1, 3, 0, 5, 8, 5 };
        int end[] = { 2, 4, 6, 7, 9, 9 };

        maxActivities(start, end); // If end[] is already sorted

        // sort by end[]
        int[][] activities = new int[start.length][3]; // index, start, end <- 3 cols of 2D array

        for (int i = 0; i < start.length; i++) {
            activities[i][0] = i;
            activities[i][1] = start[i];
            activities[i][2] = end[i];
        }

        sort2dArr(activities, 2);

        maxActivities(activities);
    }

    private static void maxActivities(int[] start, int[] end) {
        int count = 0;
        ArrayList<Integer> ans = new ArrayList<>();
        int lastactivityendTime;

        // Select 1st actvity Initially
        count = 1;
        ans.add(0); // index
        lastactivityendTime = end[0];

        for (int i = 0; i < end.length; i++) {
            // select activity
            if (start[i] >= lastactivityendTime) {
                count++;
                ans.add(i); // store index of selected activity
                lastactivityendTime = end[i];
            }
        }

        System.out.println(count);
        System.out.println(ans);
    }

    private static void sort2dArr(int[][] arr, int index) {
        // sort - lambda
        Arrays.sort(arr, Comparator.comparingDouble(o -> o[index]));
    }

    private static void maxActivities(int[][] activities) {
        int count = 0;
        ArrayList<Integer> ans = new ArrayList<>();
        int lastactivityendTime;

        // Select 1st actvity Initially
        count = 1;
        ans.add(activities[0][0]); // index
        lastactivityendTime = activities[0][2];

        for (int i = 0; i < activities.length; i++) {
            // select activity
            if (activities[i][1] >= lastactivityendTime) {
                count++;
                ans.add(activities[i][0]); // store index of selected activity
                lastactivityendTime = activities[i][2];
            }
        }

        System.out.println(count);
        System.out.println(ans);
    }
}