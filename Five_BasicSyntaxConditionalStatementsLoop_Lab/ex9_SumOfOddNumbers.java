package Five_BasicSyntaxConditionalStatementsLoop_Lab;

import java.util.Scanner;

public class ex9_SumOfOddNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());

        int number = 1;
        int sumOddNumber = 0;

        for (int count = 1; count <= n; count++) {
            System.out.println(number);
            sumOddNumber += number;
            number += 2;
        }
        System.out.println("Sum: " + sumOddNumber);
    }
}
