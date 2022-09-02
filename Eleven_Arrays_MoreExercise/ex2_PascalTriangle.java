package Eleven_Arrays_MoreExercise;

import java.util.Scanner;

public class ex2_PascalTriangle {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int rows = Integer.parseInt(scanner.nextLine());

        int[] arrays = new int[rows];

        // Pascal Triangle
        for (int i = 0; i < rows; i++) {
            arrays[i] = 1;
            for (int j = 0; j <= i; j++) {
                System.out.printf("%d ", arrays[i]);
                arrays[i] = arrays[i] * (i - j) / (j + 1);
            }
            System.out.println();
        }
    }
}


