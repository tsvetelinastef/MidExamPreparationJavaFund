package One_FirstStepsInCoding;

import java.util.Scanner;

public class ex8_PetShop {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int foodForDogs = Integer.parseInt(scanner.nextLine());
        int foodForCats = Integer.parseInt(scanner.nextLine());
        double foodCats = foodForCats * 4;
        double foodDogs = foodForDogs * 2.50;
        double foodNeeded = foodCats + foodDogs;
        System.out.printf("%.1f lv.", foodNeeded);
    }
}
