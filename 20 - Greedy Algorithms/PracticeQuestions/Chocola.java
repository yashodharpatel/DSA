package PracticeQuestions;

import java.util.Arrays;
import java.util.Collections;

public class Chocola {
    public static void main(String[] args) {
        // Given
        Integer[] horizantalCost = { 4, 1, 2 };
        Integer[] verticalCost = { 2, 1, 3, 1, 4 };

        // Sort both the array in descending order 
        Arrays.sort(horizantalCost, Collections.reverseOrder());
        Arrays.sort(verticalCost, Collections.reverseOrder());

        int horizantalPointer = 0, verticalPointer = 0;
        int horizantalPieces = 1, verticalPieces = 1;
        int cost = 0;

        while (horizantalPointer < horizantalCost.length && verticalPointer < verticalCost.length) {
            if (horizantalCost[horizantalPointer] <= verticalCost[verticalPointer]) { // vertical cut
                cost += (verticalCost[verticalPointer] * horizantalPieces);
                verticalPieces++;
                verticalPointer++;
            } else { // horizantal cut
                cost += (horizantalCost[horizantalPointer] * verticalPieces);
                horizantalPieces++;
                horizantalPointer++;
            }
        }

        // for left over parts
        // vertical
        while (verticalPointer < verticalCost.length) {
            cost += (verticalCost[verticalPointer] * horizantalPieces);
            verticalPieces++;
            verticalPointer++;
        }

        // horizantal
        while (horizantalPointer < horizantalCost.length) {
            cost += (horizantalCost[horizantalPointer] * verticalPieces);
            horizantalPieces++;
            horizantalPointer++;
        }

        int totalPieces = horizantalPieces * verticalPieces;

        System.out.println("Minimum Total Cost - " + cost);
        System.out.println("Total Pieces - " + totalPieces); 
    }
}