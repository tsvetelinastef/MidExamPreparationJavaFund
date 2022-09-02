package Twelve_Methods_Exercise;

import java.util.Scanner;

public class ex6_MiddleCharacters {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String text = scanner.nextLine();

        printMiddleCharacter(text);
    }

    private static void printMiddleCharacter(String text) {
        // дължината е нечетна
        if (text.length() % 2 == 1) {
            int indexOfMiddleCharacter = text.length() / 2;
            System.out.println(text.charAt(indexOfMiddleCharacter));
        }
        // дължината да е четна
        else {
            // 2 средни символа
            int indexFirstMiddleChar = text.length() / 2 - 1;
            int indexSecondMiddleChar = text.length() / 2;
            System.out.println(text.charAt(indexFirstMiddleChar)
                    + "" + text.charAt(indexSecondMiddleChar));
        }
    }
}
