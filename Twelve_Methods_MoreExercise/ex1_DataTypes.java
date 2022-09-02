package Twelve_Methods_MoreExercise;

import java.util.Scanner;

public class ex1_DataTypes {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String type = scanner.nextLine();
        String input = scanner.nextLine();
        multipleData(type, input);

    }

    public static void multipleData(String type, String input){
        switch (type){
            case "int":
                System.out.println(Integer.parseInt(input) * 2);
                break;
            case "real":
                System.out.printf("%.2f", Double.parseDouble(input) * 1.5);
                break;
            case "string":
                System.out.println("$" + input + "$");
                break;
        }
    }
}


