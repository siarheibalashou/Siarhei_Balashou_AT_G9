package cycletask;

import java.util.Random;

public class ArrayRandomFill {
private int[] array = new int[7];

public void arrayRandomFill (){
    Random random = new Random();
    for (int i = 0;i<array.length; i++){
        array[i] = random.nextInt(11);
    }
}
}
