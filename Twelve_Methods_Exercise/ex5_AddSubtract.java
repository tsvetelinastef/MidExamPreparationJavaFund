package Twelve_Methods_Exercise;

import java.util.Scanner;

public class ex5_AddSubtract {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int firstNumber = Integer.parseInt(scanner.nextLine());
        int secondNumber = Integer.parseInt(scanner.nextLine());
        int thirdNumber = Integer.parseInt(scanner.nextLine());

        int result = sumToGetTheSum(firstNumber, secondNumber, thirdNumber);
        System.out.println(result);

    }

    public static int sumToGetTheSum(int firstNumber, int secondNumber, int thirdNumber) {
        return ((firstNumber + secondNumber) - thirdNumber);
    }
}
