package Five_ConditionalStatementsAdvanced;

import java.util.Scanner;

public class ex4_PersonalTitles {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double age = Double.parseDouble(scanner.nextLine());
        String gender = scanner.nextLine();

        if (gender.equals("m")){
            if (age >= 16){
                System.out.println("Mr.");
            } else {
                System.out.println("Master");
            }
        } else if (gender.equals("f")){
            if (age >= 16){
                System.out.println("Ms.");
            } else {
                System.out.println("Miss");
            }
        }

    }
}
