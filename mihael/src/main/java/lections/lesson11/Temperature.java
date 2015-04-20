package lections.lesson11;

/**
 * Created by Администратор on 20.04.2015.
 */
public class Temperature implements ISearchTemperature{
    double [] ts = {7,-10,13,8,4,-7.2,-12,-3.7,3.5,-9.6,6.5,-1.7,-6.2,7};

    @Override
    public double closeToZero(double[] ts) {
        return 0;
    }
}
