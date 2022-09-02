package Twelve_NestedLoopExer;

import java.util.Scanner;

public class ex2_EqualSumsEvenOddPosition {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int firstNumber = Integer.parseInt(scanner.nextLine());
        int secondNumber = Integer.parseInt(scanner.nextLine());

        for (int i = firstNumber; i <= secondNumber; i++) {

            int oddSum = 0;
            int evenSum = 0;
            // не може да ги достъпвам извън цикъла

            String currentNum = "" + i; //

            for (int j = 0; j < 6; j++) {
                if (j % 2 == 0) {
                    evenSum += currentNum.charAt(j);
                } else {
                    oddSum += currentNum.charAt(j);
                }

            }
            if (oddSum == evenSum) {
                System.out.print(i + " ");
            }

        }
    }
}
