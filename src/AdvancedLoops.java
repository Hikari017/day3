package tasks;

public class AdvancedLoops {
    public static void main(String[] args) {

            first: for(int i = 0; i < 5; i++){
                for(int x = 0; x < 5; x++){
                    if(x == 3 && i == 3){
                        break first;
                    }
                    System.out.println(i + " : " + x);
                }
            }
        }

}
