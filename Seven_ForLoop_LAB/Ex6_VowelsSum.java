package Seven_ForLoop_LAB;

import java.util.Scanner;

public class Ex6_VowelsSum {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String text = scanner.nextLine();

        int sum = 0;
        for (int position = 0; position <= text.length() - 1; position++) {
            char symbol = text.charAt(position);
            // проверки дали символа е: a e i o u
            switch (symbol) {
                case 'a':
                    sum += 1; // sum = sum + 1;
                    break;
                case 'e':
                    sum += 2;
                    break;
                case 'i':
                    sum += 3;
                    break;
                case 'o':
                    sum += 4;
                    break;
                case 'u':
                    sum += 5;
                    break;
            }

        }

        System.out.println(sum);

    }
}

