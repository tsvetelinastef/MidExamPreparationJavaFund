package Twelve_Methods_LAB;

import java.util.Scanner;

public class ex3_PrintingTriangle {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int number = Integer.parseInt(scanner.nextLine());

// може и така:
//      for (int i = 1; i <= number; i++) {
//            printLine(1, i);
//        }
//        for (int i = number - 1; i >= 1; i--) {
//            printLine(1, i);
//        }

        printTriangle(number);

    }

    public static void printTriangle(int number) {
        for (int i = 1; i <= number; i++) {
            printLine(1, i);
        }
        for (int i = number - 1; i >= 1; i--) {
            printLine(1, i);
        }
    }

    public static void printLine(int start, int end) {
        for (int i = start; i <= end; i++) {
            System.out.print(i + " ");
        }
        System.out.println();
    }
}
