package epam;

/**
 * Created by Администратор on 20.04.2015.
 */
public class TemperatureSearchImpl implements ITemperatureSearch {

    @Override
    public double closestToZero(double[] ts) {
        double result = ts[0];
        if (ts.length == 0) {
            return 0;
        }
        return result;
    }
}
