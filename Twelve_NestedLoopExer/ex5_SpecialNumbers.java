package Twelve_NestedLoopExer;

import java.util.Scanner;

public class ex5_SpecialNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int number = Integer.parseInt(scanner.nextLine());

        for (int i = 1; i < 10; i++) {
            for (int j = 1; j < 10; j++) {
                for (int k = 1; k < 10; k++) {
                    for (int l = 1; l < 10; l++) {
                        if (number % i == 0 && number % j == 0 && number % k == 0 && number % l  == 0) {
                            System.out.printf("%d%d%d%d ", i, j, k, l);

                        }
                    }
                }
            }
        }
    }
}

