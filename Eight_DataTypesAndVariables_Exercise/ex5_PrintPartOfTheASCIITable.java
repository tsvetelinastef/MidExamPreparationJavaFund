package Eight_DataTypesAndVariables_Exercise;

import java.util.Scanner;

public class ex5_PrintPartOfTheASCIITable {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int startNumber = Integer.parseInt(scanner.nextLine());
        int endNumber = Integer.parseInt(scanner.nextLine());

        for (char a = (char) startNumber; a <= endNumber; a++) {
            System.out.printf("%c ", a);
        }
    }
}

//   for (int code = startNumber; code <= endNumber ; code++) {
//            System.out.println((code)code + " ");
//        }
