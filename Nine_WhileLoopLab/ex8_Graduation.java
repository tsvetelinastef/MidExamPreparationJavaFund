package Nine_WhileLoopLab;

import java.util.Scanner;

public class ex8_Graduation {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String name = scanner.nextLine();

        int counter = 0;
        int badGrades = 0;
        double sum = 0;

        while (counter < 12) {
            double grade = Double.parseDouble(scanner.nextLine());

            if (grade >= 4.00) {
                sum += grade;
            } else {
                ++badGrades;
            }
            if (badGrades == 2) {
                System.out.printf("%s has been excluded at %d grade", name, counter);
                break;
            }
            counter++;

        }

        if (counter == 12) {
            sum /= 12;
            System.out.printf("%s graduated. Average grade: %.2f", name, sum);
        }

    }
}
