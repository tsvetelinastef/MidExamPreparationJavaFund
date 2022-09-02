package Two_Exer_FirstStepsInCoding;

import java.util.Scanner;

public class ex3_DepositCalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double depositNumber = Double.parseDouble(scanner.nextLine());
        int term = Integer.parseInt(scanner.nextLine());
        double annualInterestRate = Double.parseDouble(scanner.nextLine());

        double sum = depositNumber + term * ((depositNumber * (annualInterestRate/ 100)) / 12);
        System.out.printf("%.2f", sum);
    }
}
