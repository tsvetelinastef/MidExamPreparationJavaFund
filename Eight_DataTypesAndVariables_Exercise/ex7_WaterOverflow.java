package Eight_DataTypesAndVariables_Exercise;

import java.util.Scanner;

public class ex7_WaterOverflow {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());

        int capacity = 255;

        for (int i = 1; i <= n; i++) {
            int liters = Integer.parseInt(scanner.nextLine());

            if (liters > capacity) {
                System.out.println("Insufficient capacity!");
            } else {
                capacity -= liters;
            }
        }
        System.out.println(255 - capacity);
    }
}

