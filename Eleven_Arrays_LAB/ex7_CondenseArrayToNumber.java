package Eleven_Arrays_LAB;

import java.util.Arrays;
import java.util.Scanner;

public class ex7_CondenseArrayToNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[] numArr = Arrays
                .stream(scanner.nextLine().split(" "))
                .mapToInt(Integer::parseInt)
                .toArray();

        while (numArr.length > 1) {
           int[] second = new int[numArr.length - 1];
            for (int i = 0; i < numArr.length - 1; i++) {
                second[i] = numArr[i] + numArr[i + 1];
                numArr[i] = second[i];
            }
            numArr = second;
        }
        System.out.println(numArr[0]);

    }
}
