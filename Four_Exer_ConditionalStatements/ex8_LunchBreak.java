package Four_Exer_ConditionalStatements;

import java.util.Scanner;

public class ex8_LunchBreak {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String nameSeries = scanner.nextLine();
        int episodeDuration = Integer.parseInt(scanner.nextLine());
        int breakDuration = Integer.parseInt(scanner.nextLine());

        double timeLunch = (breakDuration / 8.0);
        double timeBreak = (breakDuration  / 4.0);
        double timeRemain = Math.abs(breakDuration - timeLunch - timeBreak);

        if (timeRemain >= episodeDuration) {
       System.out.printf("You have enough time to watch %s and left with %.0f minutes free time.",
                    nameSeries, Math.ceil(timeRemain - episodeDuration));
        } else {
            System.out.printf("You don't have enough time to watch %s, you need %.0f more minutes.",
                    nameSeries, Math.ceil(episodeDuration - timeRemain));
        }


    }
}
