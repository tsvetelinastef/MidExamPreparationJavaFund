package Eight_DataTypesAndVariables_LAB;

import java.util.Scanner;

public class ex7_ReversedChars {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        char first = scanner.nextLine().charAt(0);
        char second = scanner.nextLine().charAt(0);
        char third = scanner.nextLine().charAt(0);

        System.out.println(third + " " + second + " " + first);

    }
}

