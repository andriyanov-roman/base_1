import org.junit.Test;

import java.util.ArrayList;

/**
 * Created by Programmer on 15.06.2015.
 */
public class Recursiya10Factorial {
    private int result = 1;
    private int[] array = new int[11];
    private int i = 0;

    @Test
    public void pushArr (){
        if (i < 10) {
            array[i] = i+1;
            System.out.println(array[i]);
            i++;
            pushArr();
        }
        result = result*array[i-1];
        System.out.println(result);
        i--;
    }
//    public void test (){
//        /* 5! */
//
//    }
}
