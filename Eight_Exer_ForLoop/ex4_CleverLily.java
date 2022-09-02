package Eight_Exer_ForLoop;

import java.util.Scanner;

public class ex4_CleverLily {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int age = Integer.parseInt(scanner.nextLine());
        double priceLaundry = Double.parseDouble(scanner.nextLine());
        double priceToy = Double.parseDouble(scanner.nextLine());

        double sum = 0.0;
        int money = 10;
        int toysCount = 0;

        for (int i = 1; i <= age; i++) {
            if (i % 2 == 0) {
                sum += money;
                money += 10;
                // За втория рожден ден получава 10.00 лв, като сумата се
                // увеличава с 10.00 лв.,
                sum -= 1; // Братът на Лили, в годините, които тя
                // получава пари, взима по 1.00 лев от тях.
            } else {
                toysCount++;
            }
        }

        sum += priceToy * toysCount;
        //  Лили продала играчките получени през годините, всяка за P лева и
        //  добавила сумата към спестените пари. С парите искала
        // да си купи пералня за X лева.

        if (sum >= priceLaundry) {
            System.out.printf("Yes! %.2f", sum - priceLaundry);
        } else {
            System.out.printf("No! %.2f", priceLaundry - sum);
        }


    }
}
