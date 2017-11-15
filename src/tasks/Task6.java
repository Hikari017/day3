package tasks;

import java.util.Random;
import java.util.Scanner;

public class Task6 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();

        final int ourNumber = random.nextInt(1000);

        int answer;
        int counter = 0;
        do{
            System.out.print("Podaj opdowiedz: ");
            answer = scanner.nextInt();


            if(answer > ourNumber){
                System.out.println("Celuj nizej");
            }else if(answer < ourNumber){
                System.out.println("Celuj wyzej");

            }
            counter++;
        }while (answer != ourNumber);
        System.out.println("WYGRALES/AS");
        System.out.println("Ilosc strzalow to: " + (counter));
    }
}
