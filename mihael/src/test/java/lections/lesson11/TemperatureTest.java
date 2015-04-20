package lections.lesson11;

import org.junit.Test;

/**
 * Created by Администратор on 20.04.2015.
 */
public class TemperatureTest {
    double [] ts3 = {7,-10,13,8,4,-7.2,-12,-3.7,3.5,-9.6,6.5,-1.7,-6.2,7};
    double [] ts2 = {7,-10,13,8,4,-7.2,-273,-3.7,5527,-9.6,6.5,-1.7,-6.2,7};
    double[] ts = {};
    double minPlus;
    double minMinus;
    @Test
    public  void closeToZero() throws Exception {
        if(ts.length ==0) {
            System.out.println("Array is empty. Return 0.");
        }
        if(ts.length ==0) {
            System.out.println("Array is empty. Return 0.");
        }
        for (int i = 0; i<ts2.length; i++){
            if((ts2[i] >= -273) &&(ts2[i] <= 5526)){}
            else throw new Exception("Exception- not in range");
        }
        minPlus = 5527;
        minMinus = -274;
        for (int i = 0; i<ts3.length; i++){

            if((ts3[i] >= minPlus) &&(ts3[i] > 0)){}
            else throw new Exception("Exception- not in range");
        }

    }
}
