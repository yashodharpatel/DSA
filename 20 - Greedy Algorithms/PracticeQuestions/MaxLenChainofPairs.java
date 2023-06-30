package PracticeQuestions;

import java.util.Arrays;
import java.util.Comparator;

// Question is somewhat similar to Activity Selecion
public class MaxLenChainofPairs {
    public static void main(String[] args) {
        int pairs[][] = { { 5, 24 }, { 39, 60 }, { 5, 28 }, { 27, 40 }, { 50, 90 } };

        Arrays.sort(pairs, Comparator.comparingDouble(o -> o[1])); // sort pairs by 2nd value

        int chainLen = 1; // By default we will select first pair
        int pairEnd = pairs[0][1]; // store end value of first pair

        for (int i = 1; i < pairs.length; i++) {
            if (pairs[i][0] > pairEnd) {
                chainLen++;
                pairEnd = pairs[i][1];
            }
        }

        System.out.println(chainLen);
    }
}
