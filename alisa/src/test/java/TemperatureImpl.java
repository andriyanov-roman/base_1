/**
 * Created by user on 20.04.2015.
 */
public class TemperatureImpl implements ISearchTemperature {
    double [] ts = {7,-10,13,8,4,-7.2,-12,-3.7,3.5,-9.6,6.5,-1.7,-6.2,7};

    @Override
    public double closestToZero(double[] ts) throws Exception {
        if (ts == null || ts.length == 0) {
            return 0;
        }
        double result;
        double maxNegative = MIN_TEMPERATURE;
        double minPositive = ts[0];
        for (int i = 0; i < ts.length; i++) {
            if (ts[i] < MIN_TEMPERATURE || ts[i] > MAX_TEMPERATURE) {
                throw new Exception();
            }
            if(ts[i] < 0 && ts[i] > maxNegative) {
                maxNegative = ts[i];
            }
            if(ts[i] < minPositive  && ts[i] > 0) {
                minPositive = ts[i];
            }
        }

        if(Math.abs(maxNegative) == minPositive) {
            result = minPositive;
        } else {
            result = minPositive;
        }

        return result;
    }
}