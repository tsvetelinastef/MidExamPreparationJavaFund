package Five_BasicSyntaxConditionalStatementsLoop_Exer;

import java.util.Scanner;

public class ex3_Vacation {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int countPeople = Integer.parseInt(scanner.nextLine()); // броя на хората
        String groupType = scanner.nextLine(); // Students ,Business , Regular
        String dayOfWeek = scanner.nextLine(); // Friday, Saturday, Sunday

        // крайна цена = броя на хората * цена за 1 нощувка
        double pricePerNight = 0;
        switch (dayOfWeek){
            case "Friday":
                // проверка за типа на групата
                switch (groupType){
                    case "Students":
                        pricePerNight = 8.45;
                        break;
                    case "Business":
                        pricePerNight = 10.90;
                        break;
                    case "Regular":
                        pricePerNight = 15;
                        break;
                }
                break;
            case "Saturday":
                switch (groupType){
                    case "Students":
                        pricePerNight = 9.80;
                        break;
                    case "Business":
                        pricePerNight = 15.60;
                        break;
                    case "Regular":
                        pricePerNight = 20;
                        break;
                }
                break;
            case "Sunday":
                switch (groupType){
                    case "Students":
                        pricePerNight = 10.46;
                        break;
                    case "Business":
                        pricePerNight = 16;
                        break;
                    case "Regular":
                        pricePerNight = 22.50;
                        break;
                }
                break;
        }

        double totalPrice = pricePerNight * countPeople;
        // отстъпки
        if (groupType.equals("Students") && countPeople >= 30){
            totalPrice = totalPrice - 0.15 * totalPrice;
        } else if (groupType.equals("Business") && countPeople >= 100){
            totalPrice = totalPrice - 10 * pricePerNight;
        } else if (groupType.equals("Regular") && countPeople >= 10 && countPeople <= 20){
            totalPrice = totalPrice - 0.05 * totalPrice;
        }

        System.out.printf("Total price: %.2f", totalPrice);
    }
}
