/**
 * Created by user on 20.04.2015.
 */
public interface ISearchTemperature {
    int MIN_TEMPERATURE = - 273;
    int MAX_TEMPERATURE = 5526;


    public double closestToZero (double [] ts)throws Exception;
}
