package Twelve_Methods_LAB;

import java.util.Scanner;

public class ex6_CalculateRectangleArea {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double width = Double.parseDouble(scanner.nextLine());
        double length = Double.parseDouble(scanner.nextLine());

        double area = areaRectangle(width, length);
        System.out.printf("%.0f", area);

    }

    public static double areaRectangle(double width, double length ) {
        return width * length;
    }
}
