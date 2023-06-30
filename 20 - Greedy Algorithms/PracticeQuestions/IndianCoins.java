package PracticeQuestions;

import java.util.*;

public class IndianCoins {
    public static void main(String[] args) {
        // given
        Integer[] currency = { 1, 2, 5, 10, 20, 50, 100, 500, 2000 };
        int amount = 590;

        // sort in descending order
        Arrays.sort(currency, Collections.reverseOrder());

        int count = 0; // to store no of coins/notes used
        ArrayList<Integer> list = new ArrayList<>(); // to store coins/notes that are used

        for (int i = 0; i < currency.length; i++) {
            if (currency[i] <= amount) {
                while (currency[i] <= amount) {
                    count++;
                    amount -= currency[i];
                    list.add(currency[i]);
                }
            }
        }

        System.out.println(list);
        System.out.println(count);
    }
}