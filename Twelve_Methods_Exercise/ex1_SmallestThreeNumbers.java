package Twelve_Methods_Exercise;

import java.util.Scanner;

public class ex1_SmallestThreeNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int firstNumber = Integer.parseInt(scanner.nextLine());
        int secondNumber = Integer.parseInt(scanner.nextLine());
        int thirdNumber = Integer.parseInt(scanner.nextLine());

        printSmallestInteger(firstNumber, secondNumber, thirdNumber);
    }

    public static void printSmallestInteger(int number1, int number2, int number3) {
        if (number1 <= number2 && number1 <= number3) {
            System.out.println(number1);
        } else if (number2 <= number1 && number2 <= number3) {
            System.out.println(number2);
        } else { //else if(number3 <= number1 && number3 <= number2)
            System.out.println(number3);
        }
    }
}
