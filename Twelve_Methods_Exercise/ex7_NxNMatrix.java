package Twelve_Methods_Exercise;

import java.util.Scanner;

public class ex7_NxNMatrix {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int number = Integer.parseInt(scanner.nextLine());
        printMatrix(number);

    }

    private static void printMatrix(int number) {
        for (int i = 0; i < number; i++) {
            for (int j = 0; j < number; j++) {
                System.out.print(" " + number);
            }
            System.out.println();
        }
    }
}

