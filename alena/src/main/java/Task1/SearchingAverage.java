package Task1;

import java.io.IOException;

/**
 * Created by MacBook on 20.04.15.
 */
public class SearchingAverage implements AverageTemperature{
    public double[] ts;

    @Override
    public double[] getMassive() {
        ts = new double[] {7, -10, 13, 8, 4, -7.2, -12, -3.7, 3.5, -9.6, 6.5, -1.7, -6.2, 7};
        return ts;
    }

    @Override
    public double[] closestToAverage() {
        return new double[0];
    }

    @Override
    public double closestToAverage(double[] ts) throws Exception {
        if (ts == null || ts.length == 0){
            return 0;
        }
        double result = ts[0];
        for (int i = 0; i < ts.length; i++) {
            if (ts[i] < -270 || ts[i] > 5700) {
                throw new Exception();
            }
        }
        double sum = 0;
        for (int i = 0; i < ts.length; i++) {
         sum = i + sum;
        }
        double average = sum / ts.length;


        return average;
    }
}
