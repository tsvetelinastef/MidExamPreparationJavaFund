package Five_ConditionalStatementsAdvanced;

import java.util.Scanner;

public class ex7_WorkingHours {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int number = Integer.parseInt(scanner.nextLine());
        String dayOfWeek = scanner.nextLine();

        switch (dayOfWeek) {
            case "Monday":
            case "Tuesday":
            case "Wednesday":
            case "Thursday":
            case "Friday":
            case "Saturday":
                if (number >= 10 && number <= 18) {
                    System.out.println("open");
                    break;
                }
            default:
                System.out.println("closed");
                break;
        }
    }
}
