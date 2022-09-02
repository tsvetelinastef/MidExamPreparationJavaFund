package Seven_ForLoop_LAB;

import java.util.Scanner;

public class ex7_SumNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());
        int sum = 0;  // ще съхраняваме сумата от числата
        for (int number = 1; number <= n; number++) {
            int value = Integer.parseInt(scanner.nextLine());
            sum = sum + value;
        }

        System.out.println(sum);

    }
}
