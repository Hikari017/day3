package tasks;

import java.util.Scanner;

public class Task8 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        final String correctPassword = "Polska";

        String typedPassword;
        do{
            System.out.print("Podaj hasło: ");
            typedPassword = scanner.nextLine();
        }while (!typedPassword.equals(correctPassword));
        System.out.println("ZALOGOWANO");
    }
}
