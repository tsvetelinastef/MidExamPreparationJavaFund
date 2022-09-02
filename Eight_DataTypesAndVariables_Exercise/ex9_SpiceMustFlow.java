package Eight_DataTypesAndVariables_Exercise;

import java.util.Scanner;

public class ex9_SpiceMustFlow {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int yield = Integer.parseInt(scanner.nextLine());

        int days = 0;
        int total = 0;

        while (yield >= 100) {
            days++;
            total += yield - 26;
            yield -= 10;
        }
        System.out.println(days);
        if (total >= 26) {
            total -= 26;
        }
        System.out.println(total);
    }
}
