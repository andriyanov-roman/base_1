package homework_1.Array;

import org.junit.Test;

import java.util.ArrayList;

/**
 * Created by Programmer on 15.06.2015.
 */
public class ArrayExample {
    public int[] array = {1, 2, 3, 4, 5, 6, 7};
    int fff;

    @Test
    public void showHalfOne() {
        if (fff < array.length / 2) {
            System.out.println(fff);
            fff++;
            showHalfOne();
        }
    }

    ;

    int ggg = array.length / 2 + 1;

    @Test
    public void showHalfTwo() {

        if (ggg < array.length + 1 && ggg > array.length / 2) {
            System.out.println(ggg);
            ggg++;
            showHalfTwo();
        }
    }

    ;

    int i = array.length;

    @Test
    public void showBackHalfOne() {
        if (i > array.length / 2) {
            System.out.println(i);
            i--;
            showBackHalfOne();
        }
    }

    int o = array.length / 2;

    @Test
    public void showBackHalfTwo() {
        if (o > 0) {
            System.out.println(o);
            o--;
            showBackHalfTwo();
        }
    }

    int r = 1;
    int fact = 1;

    @Test
    public void showFactorial() {
        if (r < array.length) {

            fact = r * fact;
            r++;
            showFactorial();

        } else
            System.out.println(fact);


    }


}
