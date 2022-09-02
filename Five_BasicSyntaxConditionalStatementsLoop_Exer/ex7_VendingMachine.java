package Five_BasicSyntaxConditionalStatementsLoop_Exer;

import java.util.Scanner;

public class ex7_VendingMachine {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String money = scanner.nextLine();

        double sum = 0;

        while (!money.equals("Start")) {
            double coins = Double.parseDouble(money);
            if (coins == 0.1 || coins == 0.2 || coins == 0.5 || coins == 1 || coins == 2) {
                sum += coins;
            } else {
                System.out.printf("Cannot accept %.2f%n", coins);
            }
            money = scanner.nextLine();
        }
        String product = scanner.nextLine();
        while (!product.equals("End")) {
            switch (product) {
                case "Nuts":
                    if (sum >= 2) {
                        sum -= 2;
                        System.out.println("Purchased " + product);
                    } else {
                        System.out.println("Sorry, not enough money");
                    }
                    break;
                case "Water":
                    if (sum >= 0.7) {
                        sum -= 0.7;
                        System.out.println("Purchased " + product);
                    } else {
                        System.out.println("Sorry, not enough money");
                    }
                    break;
                case "Crisps":
                    if (sum >= 1.5) {
                        sum -= 1.5;
                        System.out.println("Purchased " + product);
                    } else {
                        System.out.println("Sorry, not enough money");
                    }
                    break;
                case "Soda":
                    if (sum >= 0.8) {
                        sum -= 0.8;
                        System.out.println("Purchased " + product);
                    } else {
                        System.out.println("Sorry, not enough money");
                    }
                    break;
                case "Coke":
                    if (sum >= 1) {
                        sum -= 1;
                        System.out.println("Purchased " + product);
                    } else {
                        System.out.println("Sorry, not enough money");
                    }
                    break;
                default:
                    System.out.println("Invalid product");
            }

            product = scanner.nextLine();
        }
        System.out.printf("Change: %.2f%n", sum);

    }
}
