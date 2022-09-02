package Two_Exer_FirstStepsInCoding;

import java.util.Scanner;

public class ex8_BasketballEquipment {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int annualFee = Integer.parseInt(scanner.nextLine());
        double priceBasketballSneakers = annualFee - (0.4 * annualFee);
        double priceBasketballEquipment = priceBasketballSneakers - (0.2 * priceBasketballSneakers);
        double priceBasketballBall = (1 * priceBasketballEquipment)/4;
        double basketballAccessories = (1 * priceBasketballBall) / 5;
        double priceAll = annualFee + priceBasketballSneakers + priceBasketballEquipment + priceBasketballBall + basketballAccessories;

        System.out.println(priceAll);

    }
}
