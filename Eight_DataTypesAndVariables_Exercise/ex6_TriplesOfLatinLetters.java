package Eight_DataTypesAndVariables_Exercise;

import java.util.Scanner;

public class ex6_TriplesOfLatinLetters {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int number = Integer.parseInt(scanner.nextLine());

        for (char i = 97; i < 97 + number ; i++) {
            for (char j = 97; j < 97 + number; j++) {
                for (char k = 97; k < 97 + number; k++) {
                    System.out.printf("%c%c%c%n", i, j, k);
                }
            }
        }

    }
}
