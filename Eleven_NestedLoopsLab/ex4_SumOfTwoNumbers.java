package Eleven_NestedLoopsLab;

import java.util.Scanner;

public class ex4_SumOfTwoNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int startNumber = Integer.parseInt(scanner.nextLine());
        int endNumber = Integer.parseInt(scanner.nextLine());
        int magicNumber = Integer.parseInt(scanner.nextLine());

        boolean isFound = false;
        int count = 0; // броим всички комбинации
        for (int number1 = startNumber; number1 <= endNumber; number1++) {
            for (int number2 = startNumber; number2 <= endNumber; number2++) {
                // комбинация от двете числа
                count++;
                if (number1 + number2 == magicNumber) {
                    isFound = true;
                    System.out.printf("Combination N:%d (%d + %d = %d)", count, number1, number2, magicNumber);
                    break;
                }
            }
            if (isFound) {
                break;
            }
        }
        // вече сме обходили всички комбинации
        if (!isFound) {
            System.out.printf("%d combinations - neither equals %d", count, magicNumber);
        }

    }
}