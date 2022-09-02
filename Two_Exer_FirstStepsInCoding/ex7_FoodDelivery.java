package Two_Exer_FirstStepsInCoding;

import java.util.Scanner;

public class ex7_FoodDelivery {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int chickenMenu = Integer.parseInt(scanner.nextLine());
        int fishMenu = Integer.parseInt(scanner.nextLine());
        int vegetarianMenu = Integer.parseInt(scanner.nextLine());

        double priceChickenMenu = chickenMenu * 10.35;
        double priceFishMenu = fishMenu * 12.40;
        double priceVegetarianMenu = vegetarianMenu * 8.15;
        double allPriceMenu = priceChickenMenu + priceFishMenu + priceVegetarianMenu;
        double priceDessert = allPriceMenu * 0.2;
        double allPrice = allPriceMenu + priceDessert + 2.50;

        System.out.println(allPrice);
    }
}
