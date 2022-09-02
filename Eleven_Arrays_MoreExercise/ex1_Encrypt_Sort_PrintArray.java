package Eleven_Arrays_MoreExercise;

import java.util.Arrays;
import java.util.Scanner;

public class ex1_Encrypt_Sort_PrintArray {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int lines = Integer.parseInt(scanner.nextLine());
        int[] array = new int[lines];

        for (int i = 0; i < lines; i++) {
            String input = scanner.nextLine();
            int lengthString = input.length();
            int sum = 0;
            for (int j = 0; j < lengthString; j++) {
                char letter = input.charAt(j);
                switch (letter) {
                    case 'a':
                    case 'A':
                    case 'o':
                    case 'O':
                    case 'u':
                    case 'U':
                    case 'e':
                    case 'E':
                    case 'i':
                    case 'I':
                        sum += (letter * lengthString);
                        break;
                    default:
                        sum += (letter / lengthString);
                        break;
                }
            }
            array[i] = sum;
        }
        Arrays.sort(array);

        for (int el : array) {
            System.out.println(el);
        }
    }
}




