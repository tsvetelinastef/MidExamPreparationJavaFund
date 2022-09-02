package Three_ConditionalStatements;

import java.util.Scanner;

public class ex7_AreaOfFigures {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double area = 0.0;
        String figure = scanner.nextLine();
        if (figure.equals("square")) {
            double a = Double.parseDouble(scanner.nextLine());
            area = a * a;
            System.out.printf("%.3f", area);
        } else if (figure.equals("rectangle")) {
            double a = Double.parseDouble(scanner.nextLine());
            double b = Double.parseDouble(scanner.nextLine());
            area = a * b;
            System.out.printf("%.3f", area);
        } else if (figure.equals("circle")) {
            double r = Double.parseDouble(scanner.nextLine());
            area = (r * r) * Math.PI;
            System.out.printf("%.3f", area);
        } else if (figure.equals("triangle")) {
            double length = Double.parseDouble(scanner.nextLine());
            double height = Double.parseDouble(scanner.nextLine());
            area = (1 * length * height) / 2;
            System.out.printf("%.3f", area);
        }
    }
}
