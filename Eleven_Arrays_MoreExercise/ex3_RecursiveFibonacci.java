package Eleven_Arrays_MoreExercise;

import java.util.Scanner;

public class ex3_RecursiveFibonacci {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int n = Integer.parseInt(scanner.nextLine());

        long first = 0;
        long second = 1;
        long third = second + first;
        for (int i = 0; i < n; i++) {
            first = second;
            second = third;
            third = first + second;
        }
        System.out.println(first);
    }
}


// Scanner scanner = new Scanner(System.in);
//        int n = Integer.parseInt(scanner.nextLine());
//        if (n <= 0) {
//            System.out.println(0);
//            return;
//        }
//
//        if (n == 1) {
//            System.out.println(1);
//            return;
//        }
//
//        long[] fibonacci = new long[n];
//        for (int i = 0; i < n; i++) {
//            if (i == 0 || i == 1) {
//                fibonacci[i] = 1;
//            } else {
//                fibonacci[i] = fibonacci[i - 1] + fibonacci[i - 2];
//            }
//        }
//        System.out.println(fibonacci[n - 1]);
//    }
//}