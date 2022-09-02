package Four_Exer_ConditionalStatements;

import java.util.Scanner;

public class ex5_GodzillaKong {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double budget = Double.parseDouble(scanner.nextLine());
        int statists = Integer.parseInt(scanner.nextLine());
        double clothingPrice = Double.parseDouble(scanner.nextLine());

        double sumDecor = 0.1 * budget;
        double sumClothing = statists * clothingPrice;

        if (statists >= 150){
           sumClothing = sumClothing - (sumClothing * 0.1);
        }

        double allSumFilm = sumDecor + sumClothing;

        double moneyLeft = budget - allSumFilm;
        double moneyNeeded = Math.abs (budget - allSumFilm);

        if (budget > allSumFilm) {
            //double moneyLeft = budget - allSumFilm;
            System.out.println("Action!");
            System.out.printf("Wingard starts filming with %.2f leva left.", moneyLeft);
        } else if (budget <= allSumFilm) {
            //double moneyNeeded = Math.abs(allSumFilm - budget);
            System.out.println("Not enough money!");
            System.out.printf("Wingard needs %.2f leva more.", moneyNeeded);
        }
    }
}

/*
import java.util.Scanner;

public class Ex6 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double  filmBudget = Double.parseDouble(scanner.nextLine());
        int statists = Integer.parseInt(scanner.nextLine());
        double priceClothing = Double.parseDouble(scanner.nextLine());


        //Сума за декор: 10% от 20000 = 2000 лв.
        double sumDecor = filmBudget * 0.1;

        // Сума за облекло: 120 * 55.5 = 6660 лв.
        double sumClothing = statists * priceClothing;

        if(statists >= 150) {
            sumClothing = sumClothing - (sumClothing * 0.1);
        }

        // Обща сума за филма: 2000 + 6660 = 8660 лв.
        double allSumForTheFilm = sumDecor + sumClothing;

        // 20000 – 8660 = 11340 лева остават.
        double moneyLeft = filmBudget - allSumForTheFilm;

        // 9587.88 – 12083.652 = 2495.77 лева не достигат
        double moneyNeed = Math.abs (filmBudget - allSumForTheFilm);


        if (allSumForTheFilm > filmBudget) {
            System.out.println("Not enough money!");
            System.out.printf("Wingard needs %.2f leva more." ,moneyNeed );
        } else if (allSumForTheFilm <= filmBudget) {
            System.out.println("Action!");
            System.out.printf("Wingard starts filming with %.2f leva left." , moneyLeft );
        }

    }
}

 */
