package Eight_Exer_ForLoop;

import java.util.Scanner;

public class ex2_HalfSumElement {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());

        int sum = 0;
        int max = Integer.MIN_VALUE; // - 10000000
        // int min = Integer.MAX_VALUE;  // 10000000

        for (int i = 0; i < n; i++) {
            int number = Integer.parseInt(scanner.nextLine());
            sum = sum + number;

            if (number > max) {
                max = number;
            }

        }
        sum = sum - max;

        if (max == sum) {
            System.out.println("Yes");
            System.out.printf("Sum = %d", max);
        } else {
            System.out.println("No");
            System.out.printf("Diff = %d", Math.abs(sum - max));
        }


    }
}
