package tasks;

import java.util.Scanner;

public class Task9  {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Podaj liczbe N: ");
        int n = scanner.nextInt();


        int number = 1;
        for(int i = 1; i <= n; i++){
            number *= i;
        }
        System.out.println("Silnia z N to: " + number);
    }
}
