package Eight_Exer_ForLoop;

import java.util.Scanner;

public class ex5_Salary {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int openTabs = Integer.parseInt(scanner.nextLine());
        int salary = Integer.parseInt(scanner.nextLine());

        boolean isLost = false; // дали заплатата ми е изгубена

        for (int i = 0; i < openTabs; i++) { // int i = tabs --> No , започва от 0
            String site = scanner.nextLine();


            if (site.equals("Facebook")) {
                salary = salary - 150;
            } else if (site.equals("Instagram")) {
                salary = salary - 100;
            } else if (site.equals("Reddit")) {
                salary = salary - 50;
            }


            if (salary <= 0) {
                isLost = true; // загубила моите пари
                break;  // т.като имаме вход 10 , а ние въвеждаме 7 ,
                //  break; - ът е задължителен
                // ако имаме вход 10 и ние въвеждаме 10 - да ,
                // тогава няма смисъл от break;
            }
        }

        // тази проверка се прави, когато salary ми е по - голямо от 0
        if (isLost) {  // isLost == true  е същото като да напишеш само isLost,
            // иначе Ако парите са ми изгубени
            System.out.println("You have lost your salary.");
        } else {
            System.out.printf("%d", salary);
        }


    }
}
