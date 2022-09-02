package Nine_WhileLoopLab;

import java.util.Scanner;

public class ex5_AccountBalance {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double totalSum = 0.0;

        String text = scanner.nextLine();
        while (!text.equals("NoMoreMoney")) {
            double sum = Double.parseDouble(text);
// докато теста не ни е = на "NoMoreMoney"
// трябва да въвеждаме нов текст // сумата -> text == "45.67" -> дробно число
            //  ако сумата < 0
            if (sum < 0) {
                System.out.println("Invalid operation!");
                break;
            } else {
                System.out.printf("Increase: %.2f%n", sum);
                totalSum += sum;
            }
            text = scanner.nextLine();
        }
        System.out.printf("Total: %.2f", totalSum);

    }
}
