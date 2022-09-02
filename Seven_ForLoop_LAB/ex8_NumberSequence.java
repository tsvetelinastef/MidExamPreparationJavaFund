package Seven_ForLoop_LAB;

import java.util.Scanner;

public class ex8_NumberSequence {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());

        int max = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;

        for (int number = 1; number <= n; number++) {
            int value = Integer.parseInt(scanner.nextLine());
            if (value > max) { // 10 > - 2147483648
                max = value; // value, ако съм въвела: 10 , ще стане 10 = max
            }
            if (value < min) {
                min = value;
            }
        }
        System.out.println("Max number: " + max);
        System.out.println("Min number: " + min);
        // System.out.println("Max number: %d", max); - може и така да се запише ,
        // ама на мен ми дава грешка така

    }
}
