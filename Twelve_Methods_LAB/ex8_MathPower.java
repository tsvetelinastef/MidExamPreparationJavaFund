package Twelve_Methods_LAB;

import java.text.DecimalFormat;
import java.util.Scanner;

public class ex8_MathPower {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double number = Double.parseDouble(scanner.nextLine());
        int power = Integer.parseInt(scanner.nextLine());

        System.out.println(new DecimalFormat("0.####").format(mathPower(number,power)));

    }

    public static double mathPower(double number, int power) {
//       double result = 1;

//       while (power != 0){
//           result *= number;
//           --power;
//       }

        return Math.pow(number, power);
    }
}
