package Task1;

/**
 * Created by MacBook on 20.04.15.
 */
public interface AverageTemperature {
    public double[] getMassive();
    public double[] closestToAverage();

    double closestToAverage(double[] ts) throws Exception;
}
