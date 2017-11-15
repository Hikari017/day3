package tasks.arraysTasks;

public class Task4 {
    public static void main(String[] args) {
        int[] ints = {1,2,232,1,3,213,2132,13,1};

        int sum = 0;
        for (int anInt : ints) {
            sum += anInt;
        }

        System.out.println("Suma to: " + sum);
        System.out.println("Srednia to: " + (sum/ints.length));
    }
}
