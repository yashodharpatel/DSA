package PracticeQuestions;

import java.util.Arrays;
import java.util.Comparator;

public class FractionalKnapsack {
    public static void main(String[] args) {
        // Given
        int value[] = { 100, 60, 120 };
        int weight[] = { 20, 10, 30 };
        int totalCapacity = 50;

        double ratio[][] = new double[weight.length][2];

        for (int i = 0; i < ratio.length; i++) {
            ratio[i][0] = i; // index
            ratio[i][1] = value[i] / weight[i]; // ratio
        }

        // sort by ratio - lambda
        Arrays.sort(ratio, Comparator.comparingDouble(o -> o[1]));

        int totalVal = 0; // Total Profit

        for (int i = ratio.length - 1; i >= 0; i--) {
            int idx = (int) ratio[i][0];
            if (totalCapacity >= weight[idx]) { // include full item
                totalVal += value[idx];
                totalCapacity -= weight[idx];
            } else { // include fractional item
                totalVal += (ratio[i][1] * totalCapacity);
                totalCapacity = 0;
                break;
            }
        }

        System.out.println(totalVal);
    }
}