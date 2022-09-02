package Eleven_Arrays_LAB;

import java.util.Scanner;

public class ex5_EvenAndOddSubtraction {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String[] arr = scanner.nextLine().split(" ");

        int[] numArr = new int[arr.length];

        for (int i = 0; i < numArr.length; i++) {
            numArr[i] = Integer.parseInt(arr[i]); // take String and parse it to Int
        }

        int evenSum = 0;
        int oddSum = 0;
        for (int num: numArr) {
            if (num % 2 == 0){
                evenSum += num;
            } else {
                oddSum += num;
            }
        }
        int diff = evenSum - oddSum;
        System.out.println(diff);
    }
}
