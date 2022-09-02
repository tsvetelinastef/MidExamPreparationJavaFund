package Five_BasicSyntaxConditionalStatementsLoop_Exer;

import java.util.Scanner;

public class ex5_Login {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String user = scanner.nextLine();
        String pass = scanner.nextLine();

        StringBuilder sb = new StringBuilder(user);
        String reversedUser = sb.reverse().toString();

        int counter = 0;
        while(true) {
            if(!pass.equals(reversedUser)) {
                counter++;
                if(counter == 4) {
                    System.out.println("User " + user + " blocked!");
                    return ;
                }
                System.out.println("Incorrect password. Try again.");
            } else {
                System.out.println("User " + user + " logged in.");
                break;
            }
            pass = scanner.nextLine();
        }
    }
}
