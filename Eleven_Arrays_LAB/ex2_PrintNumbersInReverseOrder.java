package Eleven_Arrays_LAB;

import java.util.Scanner;

public class ex2_PrintNumbersInReverseOrder {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

         int n = Integer.parseInt(scanner.nextLine());

         int[] numArr = new int[n];
        for (int i = 0; i < numArr.length; i++) {
            numArr[i] = Integer.parseInt(scanner.nextLine());
        }
        for (int i = numArr.length - 1; i >= 0 ; i--) {
            System.out.print(numArr[i] + " ");
        }
        System.out.println();
    }
}
