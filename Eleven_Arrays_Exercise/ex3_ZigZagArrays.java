package Eleven_Arrays_Exercise;

import java.util.Scanner;

public class ex3_ZigZagArrays {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());

        String[] firstArray = new String[n];
        String[] secondArray = new String[n];

        for (int i = 0; i < n; i++) {
            String input = scanner.nextLine();
            String firstNumber = input.split(" ")[0];
           String secondNumber = input.split(" ")[1];
            if (i % 2 == 0) {
                firstArray[i] = secondNumber;
               secondArray[i] = firstNumber;
            } else {
                firstArray[i] = firstNumber;
                secondArray[i] = secondNumber;
            }
        }
        System.out.print(String.join(" ", secondArray));
        System.out.print("\n" + String.join(" ", firstArray));
    }
}
