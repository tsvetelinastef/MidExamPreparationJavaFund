package Eleven_Arrays_Exercise;

import java.util.Scanner;

public class ex1_Train {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int countWagons = Integer.parseInt(scanner.nextLine());
        int[] wagons = new int[countWagons];

        for (int wagon = 0; wagon < countWagons; wagon++) {
            int countPeople = Integer.parseInt(scanner.nextLine());
            wagons[wagon] = countPeople;
        }

       // for (int index = 0; index < wagons.length; index++) {
       //     int currentElement = wagons[index];
       //     System.out.print(currentElement + " ");
       // }

        System.out.println();

        int sum = 0;
        for (int number : wagons) {
            System.out.print(number + " ");
            sum += number;
        }
        System.out.println();
        System.out.println(sum);

      //  System.out.println(Arrays.stream(wagons).sum());
    }
}
