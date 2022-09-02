package Eight_DataTypesAndVariables_Exercise;

import java.util.Scanner;

public class ex10_PokeMon {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int power = Integer.parseInt(scanner.nextLine());
        int distance = Integer.parseInt(scanner.nextLine());
        int exhaustionFactor = Integer.parseInt(scanner.nextLine());

        // stop: power < distance
        // continue: power >= distance
        int count = 0; // брой на poke - ве
        int firstTimePower = power; // първоначалната стойност на силата преди poke- ването


        while (power >= distance){
            power -= distance; // 1 poke
            count++;
            // проверка дали текущия power = 1/2 от първонаалния
            if (power == firstTimePower * 0.5){
                if (exhaustionFactor > 0){
                    power = power/ exhaustionFactor;
                }
            }
        }
        System.out.println(power);
        System.out.println(count);
    }
}

/*
Scanner scanner = new Scanner(System.in);

        int power = Integer.parseInt(scanner.nextLine());
        int distance = Integer.parseInt(scanner.nextLine());
        int exhaustionFactor = Integer.parseInt(scanner.nextLine());

        // stop: power < distance
        // continue: power >= distance

          int count = 0;
        int x = power / 2;
        boolean realHalf = power % x == 0;

        while (power >= distance) {
            power -= distance;
            count++;
            if (exhaustionFactor > 0 && realHalf && power == x) {
                power /= exhaustionFactor;
            }
        }
        System.out.println(power);
        System.out.println(count);
    }
}
 */
