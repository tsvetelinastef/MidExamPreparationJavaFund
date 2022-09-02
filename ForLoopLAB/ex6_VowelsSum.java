package ForLoopLAB;

import java.util.Scanner;

public class ex6_VowelsSum {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String input = scanner.nextLine();
        int sum = 0;
        for (int i = 0; i <= input.length() - 1; i++) {
            char letter = input.charAt(i);
            // проверки дали символа е: a e i o u
            switch (letter){
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


