package Eight_DataTypesAndVariables_LAB;

import java.util.Scanner;

public class ex1_ConvertMetersToKilometers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int meters = Integer.parseInt(scanner.nextLine());
        double kilometers = (meters * 1.0) / 1000; // meters / 1000.0
        System.out.printf("%.2f", kilometers);
    }
}
