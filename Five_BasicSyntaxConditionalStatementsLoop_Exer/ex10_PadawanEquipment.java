package Five_BasicSyntaxConditionalStatementsLoop_Exer;

import java.util.Scanner;

public class ex10_PadawanEquipment {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double moneyHave = Double.parseDouble(scanner.nextLine());
        int countStudents = Integer.parseInt(scanner.nextLine());
        double priceLightSabers = Double.parseDouble(scanner.nextLine());
        double priceRobe = Double.parseDouble(scanner.nextLine());
        double priceBelt = Double.parseDouble(scanner.nextLine());

        double totalRobe = countStudents * priceRobe;
        double totalBelt;

        if (countStudents >= 6) {
            totalBelt = (countStudents - Math.floor(countStudents / 6.0)) * priceBelt;
        } else {
            totalBelt = countStudents * priceBelt;
        }

        double totalLightSaber = (countStudents + Math.ceil(countStudents * 0.1)) * priceLightSabers;
        double totalPrice = totalLightSaber + totalRobe + totalBelt;

        if (totalPrice <= moneyHave) {
            System.out.printf("The money is enough - it would cost %.2flv.", totalPrice);
        } else {
            System.out.printf("George Lucas will need %.2flv more.", totalPrice - moneyHave);
        }
    }
}
