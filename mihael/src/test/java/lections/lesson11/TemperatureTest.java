package lections.lesson11;

import org.junit.Test;

/**
 * Created by Администратор on 20.04.2015.
 */
public class TemperatureTest {
    public static final  int MIN_TEMPERATURE = -273;
    public static final  int MAX_TEMPERATURE = 5526;
    double [] ts3 = {7,-10,13,8,4,-7.2,-12,-3.7,3.5,-9.6,6.5,-1.7,-6.2,7,1.7};
    double [] ts2 = {7,-10,13,8,4,-7.2,-273,-3.7,5526,-9.6,6.5,-1.7,-6.2,7};
    double[] ts = {};
    double minPlus;
    double minMinus;
    double result;
    @Test
    public  void closeToZero() throws Exception {
        if(ts == null ||ts.length ==0) {
            System.out.println("Array is empty. Return 0.");
        }

        for (int i = 0; i<ts2.length; i++){
            if((ts2[i] >= MIN_TEMPERATURE) &&(ts2[i] <= MAX_TEMPERATURE)){}
            else throw new Exception("Exception- not in range");
        }
        minPlus = MAX_TEMPERATURE +1;
        minMinus = MIN_TEMPERATURE -1;

        for (int i = 0; i<ts3.length; i++){

            if((ts3[i] < minPlus) &&(ts3[i] > 0)){
                minPlus = ts3[i];
            }
            if((ts3[i] > minMinus) &&(ts3[i] < 0)){
                minMinus = ts3[i];

            }
        }

        if(minPlus < Math.abs(minMinus)){
            result = minPlus;

        } else  if(minPlus == Math.abs(minMinus)){
            result = minPlus;
        } else result = minMinus;

        System.out.println(result);

    }
}
