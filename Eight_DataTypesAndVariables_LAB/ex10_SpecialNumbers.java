package Eight_DataTypesAndVariables_LAB;

import java.util.Scanner;

public class ex10_SpecialNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());

        for (int i = 1; i <= n; i++) {
            int sum = 0;
            int num = i;
            // за да взима символа от всяко число
            while (num > 0){
                sum = sum + (num % 10); // взима последната цифра
                num = num / 10; // премахва последната цифра
            }
            if (sum == 5 || sum == 7 || sum == 11){
                System.out.printf("%d -> True%n", i);
            } else {
                System.out.printf("%d -> False%n", i);
            }
        }

    }
}

// To calculate the sum of digits of given number num, you might repeat the following:
// sum the last digit (num % 10)
//and remove it (sum = sum / 10) until num reaches 0.

// :/ .... :/  //
