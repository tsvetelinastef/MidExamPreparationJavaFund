package Five_BasicSyntaxConditionalStatementsLoop_Lab;

import java.util.Scanner;

public class ex11_MultiplicationTable2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());
        int times = Integer.parseInt(scanner.nextLine());

        do {
            System.out.printf("%d X %d = %d%n", n, times, n * times);
            times++;
        } while (times <= 10);


    }
}

// При 2 и 14 ---> Не може, while става false и не прави нищо, а на нас ни искат да изпечата 1 ред
//  while(times <= 10){
//            System.out.printf("%d X %d = %d%n", n, times, n * times);
//            times++;
//        }
