package One_FirstStepsInCoding;

import java.util.Scanner;

public class ex9_YardGreening {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
       // int area = Integer.parseInt(scanner.nextLine());
        double area = Double.parseDouble(scanner.nextLine());

        double allArea = area * 7.61;
        double discount = 0.18 * allArea;
        double finalPrice = allArea - discount;
        System.out.printf("The final price is: %.2f lv.%n", finalPrice);
        System.out.printf("The discount is: %.2f lv.%n", discount);
    }
}
