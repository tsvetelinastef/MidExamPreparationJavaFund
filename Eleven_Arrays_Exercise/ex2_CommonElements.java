package Eleven_Arrays_Exercise;

import java.util.Scanner;

public class ex2_CommonElements {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String firstLine = scanner.nextLine(); // "Hey hello 2 4"
        String secondLine = scanner.nextLine(); // "10 hey 4 hello"

        String[] array1 = firstLine.split(" ");
        String[] array2 = secondLine.split(" ");

        for (String elementInSecond : array2){
            for (String elementInFirst : array1){
                if (elementInSecond.equals(elementInFirst)){
                    System.out.print(elementInSecond + " ");
                }
            }
        }
    }
}
