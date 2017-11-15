public class Loops {
    public static void main(String[] args) {
        int i = 0;


      cos:  for(; i <= 50 ; i++) {
            if(i == 43){
                continue cos;
            }
            System.out.println(i);

        }

        int c = 1921222;

        while (c > Short.MAX_VALUE){
            c -= Short.MAX_VALUE-1;
        }

        System.out.println("COS: " + c);

        long cos = 5 * 10L;



        int counter = 0;
        while(counter < 10){
            System.out.println("Hello World");
            counter++;
        }

        int counter1 = 0;
        do{
            System.out.println("Jestem do_while");
            counter1++;
        }while (counter1 < 10);





    }
}
