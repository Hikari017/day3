import java.util.Arrays;
import java.util.stream.Stream;

public class ArraysPod {
    public static void main(String[] args) {
        byte[] b1 = {1, 2, 2, 3, 4, 4,5,5};

//        for(int i = 0; i <= b1.length; i++){
//            System.out.println(b1[i]);
//        }
        //

        for(byte cos : b1){
            System.out.println(cos);
        }

    }
}
