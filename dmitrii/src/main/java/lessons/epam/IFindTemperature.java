package lessons.epam;

/**
 * Created by user on 20.04.2015.
 */
public interface IFindTemperature {
    int MIN_TEMPERATURE = -273;
    int MAX_TEMPERATURE = 5526;
    Double closestToZero(Double[] ts) throws Exception;
}
