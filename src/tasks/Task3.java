package tasks;

public class Task3 {
    public static void main(String[] args) {
        for(int i = 5; i <= 50; i++){
            if(i % 2 != 0){
                System.out.println(i);
            }
        }
        //
        for(int i = 5; i <= 50; i += 2){
            System.out.println(i);
        }
    }
}
