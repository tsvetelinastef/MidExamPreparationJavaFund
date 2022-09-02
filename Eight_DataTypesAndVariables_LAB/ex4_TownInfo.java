package Eight_DataTypesAndVariables_LAB;

import java.util.Scanner;

public class ex4_TownInfo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String town = scanner.nextLine();
        int population = Integer.parseInt(scanner.nextLine());
        double area = Double.parseDouble(scanner.nextLine());

        System.out.printf("Town %s has population of %d and area %.0f square km.",
                town, population,area);
    }
}
