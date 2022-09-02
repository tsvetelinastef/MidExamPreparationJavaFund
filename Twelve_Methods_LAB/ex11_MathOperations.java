package Twelve_Methods_LAB;

import java.text.DecimalFormat;
import java.util.Scanner;

public class ex11_MathOperations {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int firstNumber = Integer.parseInt(scanner.nextLine());
        String operator = scanner.nextLine();
        int secondNumber = Integer.parseInt(scanner.nextLine());

        System.out.println(new DecimalFormat("0.##").format(calculate(firstNumber, operator, secondNumber)));
    }

    private static double calculate(int firstNumber, String operator, int secondNumber) {
        double sum = 0.0;

        switch (operator) {
            case "+":
                sum = firstNumber + secondNumber;
                break;
            case "-":
                sum = firstNumber - secondNumber;
                break;
            case "*":
                sum = firstNumber * secondNumber;
                break;
            case "/":
                sum = firstNumber* 1.0 / secondNumber;
                break;
        }
        return sum;
    }
}


