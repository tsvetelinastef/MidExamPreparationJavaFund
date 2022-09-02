package Ten_WhileLoopExer;

import java.util.Scanner;

public class ex5_Coins {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double changeInLeva = Double.parseDouble(scanner.nextLine());
        double changeInSt = Math.round(changeInLeva * 100);

        int countCoins= 0;

        while(changeInSt > 0){
            if (changeInSt >= 200){  // 200 стотинки
                changeInSt -= 200;
                countCoins++;
            } else if (changeInSt >= 100){  // 100 стотинки
                changeInSt -= 100;
                countCoins++;
            } else if (changeInSt >= 50){  // 50 стотинки
                changeInSt -= 50;
                countCoins++;
            } else if (changeInSt >= 20){
                changeInSt -= 20;
                countCoins++;
            } else if (changeInSt >= 10){
                changeInSt -= 10;
                countCoins++;
            } else if (changeInSt >= 5){
                changeInSt -= 5;
                countCoins++;
            } else if (changeInSt >= 2){
                changeInSt -= 2;
                countCoins++;
            } else if (changeInSt >= 1){
                changeInSt -= 1;
                countCoins++;
            }
        }
        System.out.println(countCoins);

    }
}
