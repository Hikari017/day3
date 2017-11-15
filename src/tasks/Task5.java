package tasks;

import java.util.Scanner;

public class Task5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Podaj N: ");
        int n = scanner.nextInt();

        int sum = 0;
        for(int i = 1; i <= n; i++){
            sum += i;
        }

        System.out.println("Suma to: " + sum);

    }
}
