package One_FirstStepsInCoding;

import java.util.Scanner;

public class ex4_InchesToCentimeters {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double a = scanner.nextDouble();
        double area = a * 2.54;
        System.out.println(area);
    }
}
