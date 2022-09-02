package Seven_ForLoop_LAB;

import java.util.Scanner;

public class ex5_CharacterSequence {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String text = scanner.nextLine();
        for (int i = 0; i <  text.length(); i++) {
            char letter = text.charAt(i);
            System.out.println(letter);
        }

    }
}
