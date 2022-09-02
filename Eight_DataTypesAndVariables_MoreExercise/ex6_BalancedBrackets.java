package Eight_DataTypesAndVariables_MoreExercise;

import java.util.Scanner;

public class ex6_BalancedBrackets {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int inputLinesNumber = Integer.parseInt(scanner.nextLine());

        String bracketsString = "";

        boolean isOpeningBracket = false;
        boolean isClosingBracket = false;

        for (int i = 1; i <= inputLinesNumber; i++) {
            String input = scanner.nextLine();
            if (input.length() == 1 && (input.charAt(0) == '(' || input.charAt(0) == ')')) {
                bracketsString += input;
            }
        }
        if (bracketsString.length() % 2 == 0) {
            for (int j = 0; j < bracketsString.length(); j += 2) {
                if (bracketsString.charAt(j) == '(') {
                    isOpeningBracket = true;
                } else {
                    isOpeningBracket = false;
                    break;
                }
            }
            for (int j = 1; j < bracketsString.length(); j += 2) {
                if (bracketsString.charAt(j) == ')') {
                    isClosingBracket = true;
                } else {
                    isClosingBracket = false;
                    break;
                }
            }
        }
        if (isOpeningBracket && isClosingBracket) {
            System.out.println("BALANCED");
        } else {
            System.out.println("UNBALANCED");
        }
    }
}

