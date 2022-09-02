package Four_Exer_ConditionalStatements;

import java.util.Scanner;

public class ex4_ToyShop {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double priceHoliday = Double.parseDouble(scanner.nextLine());
        int puzzles = Integer.parseInt(scanner.nextLine());
        int talkingDolls = Integer.parseInt(scanner.nextLine());
        int bears = Integer.parseInt(scanner.nextLine());
        int minions = Integer.parseInt(scanner.nextLine());
        int trucks = Integer.parseInt(scanner.nextLine());

        double sum = puzzles * 2.60 + talkingDolls * 3.00 + bears * 4.10 + minions * 8.20 + trucks * 2.00;
        int numberToys = puzzles + talkingDolls + bears + minions + trucks;
        if (numberToys >= 50) {
             sum = sum - sum * 0.25;
        }
        sum = sum - sum * 0.10;

        if (sum >= priceHoliday) {
            System.out.printf("Yes! %.2f lv left.", sum - priceHoliday);
        } else {
            System.out.printf("Not enough money! %.2f lv needed.", priceHoliday - sum);
        }

    }
}
