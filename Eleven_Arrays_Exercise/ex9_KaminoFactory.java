package Eleven_Arrays_Exercise;

import java.util.Scanner;

public class ex9_KaminoFactory {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int dnaLength = Integer.parseInt(scanner.nextLine());
        int bestSequenceSum = 0;
        int bestSequenceIndex = 0;
        int bestSample = 0;


        String input = scanner.nextLine();
        String[] dna = new String[dnaLength];

        while (!input.equals("Clone them!")) {
            dna = input.split("!");
            bestSample++;

            int length = 0;
            int maxLength = 0;
            int startIndex = 0;

            for (int i = 0; i < dna.length - 1; i++) {
                int dnaAsNum = Integer.parseInt(dna[i]);
                int nextDnaAsNum = Integer.parseInt(dna[i + 1]);
                if (dnaAsNum == nextDnaAsNum) {
                    length++;
                } else {
                    length = 0;
                    startIndex = i + 1;
                }
                if (length > maxLength) {
                    maxLength = length;
                    bestSequenceIndex = startIndex;
                }
            }
            input = scanner.nextLine();
        }

        for (String el : dna) {
            System.out.printf("%s ", el);
        }
    }
}
