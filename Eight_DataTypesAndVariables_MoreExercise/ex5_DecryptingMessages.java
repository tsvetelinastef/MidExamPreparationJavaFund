package Eight_DataTypesAndVariables_MoreExercise;

import java.util.Scanner;

public class ex5_DecryptingMessages {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int key = Integer.parseInt(scanner.nextLine());
        int inputNumberOfLetters = Integer.parseInt(scanner.nextLine());

        for (int i = 1; i <= inputNumberOfLetters; i++) {
            char currentLetter = scanner.nextLine().charAt(0);
            int letterCode = (int) currentLetter + key;
            System.out.print((char) letterCode);
        }
    }
}

