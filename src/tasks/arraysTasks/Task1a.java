package tasks.arraysTasks;

import java.util.Scanner;

public class Task1a {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("wproadz liczby, odziel je spacjami: ");

        String[] strings = scanner.nextLine().split(" ");

        for (int i = strings.length - 1; i >= 0; i--) {
            System.out.println(strings[i]);
        }
    }
}
