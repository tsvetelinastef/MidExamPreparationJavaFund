package Five_BasicSyntaxConditionalStatementsLoop_Exer;

import java.util.Scanner;

public class ex11_RageExpenses {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int countLosesGames = Integer.parseInt(scanner.nextLine());
        double headsetPrice = Double.parseDouble(scanner.nextLine());
        double mousePrice = Double.parseDouble(scanner.nextLine());
        double keyboardPrice = Double.parseDouble(scanner.nextLine());
        double displayPrice = Double.parseDouble(scanner.nextLine());

        // търсим
        // броя счупени слушалки
        int countHeadset = countLosesGames/2;
        // броя счупени мишки
        int countMice = countLosesGames / 3;
        // броя счупени клавиатури
        int countKeyboard = countLosesGames / 6;
        // броя счупени монитори
        int countDisplays = countLosesGames / 12;

        // разходите
        double expenses =
                (countHeadset * headsetPrice)
              + (countMice * mousePrice)
              + (countKeyboard * keyboardPrice)
              + (countDisplays * displayPrice);

        System.out.printf("Rage expenses: %.2f lv.", expenses);

    }
}
