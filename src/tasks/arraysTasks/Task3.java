package tasks.arraysTasks;

public class Task3 {
    public static void main(String[] args) {
        int[] someArray  = {1,2,2,2,2,2,3,1,2,4,5,2,2,5,1,6,1};

        int currentMax = 0; 
        int currentValue = 0; 
        
        for (int i = 0; i < someArray.length; i++) {
             int localMax = someArray[i];
             int localValue = 0;
            for (int x = 0; x < someArray.length; x++) {
                if(someArray[i] == someArray[x]){
                    localValue++;
                }
            }
            if(localValue > currentValue){
                currentMax = localMax;
                currentValue = localValue;
            }
        }

        System.out.println(currentMax);
    }
}
