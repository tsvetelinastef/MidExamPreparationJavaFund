package Five_BasicSyntaxConditionalStatementsLoop_Lab;

import java.util.Scanner;

public class ex1_StudentInformation {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String name = scanner.nextLine();
        int age = Integer.parseInt(scanner.nextLine());
        double grade = Double.parseDouble(scanner.nextLine());

        System.out.printf("Name: %s, Age: %d, Grade: %.2f", name, age, grade);

    }
}
// Друг вариант на System.out.printf("Name: %s, Age: %d, Grade: %.2f", name, age, grade);
// String result  = String.format("Name: %s, Age: %d, Grade: %.2f", name, age, grade);
// System.out.println(result);
