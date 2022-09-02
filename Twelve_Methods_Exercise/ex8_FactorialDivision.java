package Twelve_Methods_Exercise;

import java.util.Scanner;

public class ex8_FactorialDivision {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int firstNumber = Integer.parseInt(scanner.nextLine());
        int secondNumber = Integer.parseInt(scanner.nextLine());


        //  факториел на 1вото число
        long firstNumberFactorial = printFactorialDivision(firstNumber);
        //  факториел на 2рото число
        long secondNumberFactorial = printFactorialDivision(secondNumber);
        // факториел1/ факториел2 -> печатаме
        double result = firstNumberFactorial * 1.0 / secondNumberFactorial;
        System.out.printf("%.2f", result);

    }

    public static long printFactorialDivision(int number) {
        long fact = 1;
        for (int i = 1; i <= number; i++) {
            fact = fact * i;
        }
        return fact;
    }
}
