package Eleven_NestedLoopsLab;

import java.util.Scanner;

public class ex5_Travelling {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

  // там и ще започне да спестява. Когато е спестила достатъчно, ще може да пътува.
  //След това ще се четат няколко суми, реални числа, които Ани спестява като
  // работи и когато успее да събере достатъчно за пътуването, ще заминава,
        // като на конзолата трябва да се изпише:
        //"Going to {дестинацията}!"
  //Когато е посетила всички дестинации, които иска, вместо дестинация
  // ще въведе "End" и програмата ще приключи.

        String destination = scanner.nextLine();
       // double  minimalBudget = Double.parseDouble(scanner.nextLine());
        while (!destination.equals("End")){
            // държава - цена
            double excursionPrice = Double.parseDouble(scanner.nextLine());
            // събирам пари
            // минималния бюджет, който ще е нужен за пътуването
            double availableMoney = 0;
            //стоп -> availableMoney >= excursionPrice
            //продължава -> availableMoney < excursionPrice
            while (availableMoney < excursionPrice) {
                // След това ще се четат няколко суми, които Ани спестява като работи
                double savedMoney = Double.parseDouble(scanner.nextLine());
                availableMoney += savedMoney;
            }
            // налични пари > пари за екскурзията
            System.out.printf("Going to %s!%n", destination);
            destination = scanner.nextLine();
        }
    }
}
