package tasks.arraysTasks;

public class Task2 {
    public static void main(String[] args) {
        int[] someArray = {2, 2,2,14,124,412,423,1123,21, 4};

        int min = someArray[0];
        for (int i : someArray) {
            if(min > i){
                min = i;
            }
        }

        System.out.println(min);
    }
}
