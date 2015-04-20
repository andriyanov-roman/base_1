package temper_test;

import org.junit.Test;

/**
 * Created by user on 20.04.2015.
 */
public class Temper {
    public Double[] tsUtil () throws Exception {
        Double[] ts = new Double[10];
        for (int i = 0; i < ts.length; i++) {
            ts[i]= (Math.random()*5800)-273;
        }
        return ts;
    }
    @Test
    public void closestToZeroI () throws Exception {
        Double[] ts = new Double[10];
        for (int i = 0; i < ts.length; i++) {
            ts[i]= (Math.random()*5800)-273;
        }

    }

    @Test
    public void testTest () throws Exception {
        for (int i = 0; i < 10; i++) {
            System.out.println((Math.random()*5800)-273);
        }
    }
}
