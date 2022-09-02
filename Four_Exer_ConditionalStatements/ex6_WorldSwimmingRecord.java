package Four_Exer_ConditionalStatements;

import java.util.Scanner;

public class ex6_WorldSwimmingRecord {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double recordSeconds = Double.parseDouble(scanner.nextLine());
        double distanceMeters = Double.parseDouble(scanner.nextLine());
        double timeSeconds = Double.parseDouble(scanner.nextLine());

        double swimNeed =  (distanceMeters * timeSeconds);
       // double secondsAdded = ((distanceMeters / 15.0) * 12.5);
        double slowdown = Math.floor(distanceMeters / 15);
        double slowdownTwo = slowdown * 12.5;
        double allTime = swimNeed + slowdownTwo;

        if (allTime < recordSeconds) {
            System.out.printf("Yes, he succeeded! The new world record is %.2f seconds.", allTime);
        } else {
            System.out.printf("No, he failed! He was %.2f seconds slower.", Math.abs(recordSeconds - allTime));
        }
    }
}

