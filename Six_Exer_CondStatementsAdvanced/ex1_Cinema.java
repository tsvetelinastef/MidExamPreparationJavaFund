package Six_Exer_CondStatementsAdvanced;

import java.util.Scanner;

public class ex1_Cinema {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String projects = scanner.nextLine();
        int r = Integer.parseInt(scanner.nextLine());
        int c = Integer.parseInt(scanner.nextLine());

        double sum = 0.0;
        if (projects.equals("Premiere")) {
            sum = r * c * 12.00;
        } else if (projects.equals("Normal")) {
            sum = r * c * 7.50;
        } else if (projects.equals("Discount")) {
            sum = r * c * 5.00;
        }

        System.out.printf("%.2f leva", sum);


    }
}
