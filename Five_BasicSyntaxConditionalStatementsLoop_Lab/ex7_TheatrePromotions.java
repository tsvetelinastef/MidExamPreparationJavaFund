package Five_BasicSyntaxConditionalStatementsLoop_Lab;

import java.util.Scanner;

public class ex7_TheatrePromotions {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String typeDay = scanner.nextLine();
        int age = Integer.parseInt(scanner.nextLine());

        String priceTicket;

        switch (typeDay) {
            case "Weekday":
                if (age >= 0 && age <= 18) {
                    priceTicket = "12$";
                    System.out.println(priceTicket);
                } else if (age >= 18 && age <= 64) {
                    priceTicket = "18$";
                    System.out.println(priceTicket);
                } else if (age > 64 && age <= 122) {
                    priceTicket = "12$";
                    System.out.println(priceTicket);
                } else {
                    System.out.println("Error!");
                }

                break;
            case "Weekend":
                if (age >= 0 && age <= 18) {
                    priceTicket = "15$";
                    System.out.println(priceTicket);
                } else if (age >= 18 && age <= 64) {
                    priceTicket = "20$";
                    System.out.println(priceTicket);
                } else if (age > 64 && age <= 122) {
                    priceTicket = "15$";
                    System.out.println(priceTicket);
                } else {
                    System.out.println("Error!");
                }

                break;
            case "Holiday":
                if (age >= 0 && age <= 18) {
                    priceTicket = "5$";
                    System.out.println(priceTicket);
                } else if (age >= 18 && age <= 64) {
                    priceTicket = "12$";
                    System.out.println(priceTicket);
                } else if (age > 64 && age <= 122) {
                    priceTicket = "10$";
                    System.out.println(priceTicket);
                } else {
                    System.out.println("Error!");
                }
                break;
            default:
                System.out.println("Error!");
                break;
        }


    }
}
