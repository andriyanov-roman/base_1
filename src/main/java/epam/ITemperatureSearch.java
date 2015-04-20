package epam;

/**
 * Created by Администратор on 20.04.2015.
 */
public interface ITemperatureSearch {
    int MIN_TEMPERATURE = -273;
    int MAX_TEMPERATURE = 5526;

    public double closestToZero(double[] ts) throws Exception;

}
