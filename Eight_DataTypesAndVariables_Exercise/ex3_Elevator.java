package Eight_DataTypesAndVariables_Exercise;

import java.util.Scanner;

public class ex3_Elevator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int countPeople = Integer.parseInt(scanner.nextLine());
        int capacity = Integer.parseInt(scanner.nextLine());

        double courses = Math.ceil(countPeople * 1.0 / capacity);
        System.out.printf("%.0f", courses);
    }
}
