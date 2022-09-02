package Eleven_Arrays_Exercise;

import java.util.Arrays;
import java.util.Scanner;

public class ex6_EqualSums {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[] arr = Arrays.stream(scanner.nextLine().split(" ")).mapToInt(Integer::parseInt).toArray();

        int index = 0;
        for (int i = 0; i < arr.length; i++) {
            int leftSum = 0;
            int rightSum = 0;

            boolean isEqual = false;

            for (int j = 0; j < i; j++) {
                leftSum += arr[j];
            }

            for (int j = i + 1; j < arr.length; j++) {
                rightSum += arr[j];
            }

            if (leftSum == rightSum) {
                isEqual = true;
                index = i;

            }
            if (isEqual) {
                System.out.printf("%d", index);
                break;
            } else if (i == arr.length - 1) {
                System.out.println("no");
            }
        }
    }
}

