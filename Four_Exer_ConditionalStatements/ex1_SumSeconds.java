package Four_Exer_ConditionalStatements;

import java.util.Scanner;

public class ex1_SumSeconds {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int timeFirst = Integer.parseInt(scanner.nextLine());
        int secondFirst = Integer.parseInt(scanner.nextLine());
        int thirdFirst = Integer.parseInt(scanner.nextLine());

        int totalTime = timeFirst + secondFirst + thirdFirst;
        int minutes = totalTime / 60;
        int seconds = totalTime % 60;
        if (seconds < 10){
            System.out.printf("%d:0%d", minutes, seconds);
        } else {
            System.out.printf("%d:%d", minutes, seconds);
        }
       // System.out.printf("%d:%02f", minutes, seconds);
    }
}
