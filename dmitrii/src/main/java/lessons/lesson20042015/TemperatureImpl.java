package lessons.lesson20042015;

/**
 * Created by user on 20.04.2015.
 */
public class TemperatureImpl implements IFindTemperature{
    @Override
    public Double closestToZero(Double[] ts) throws Exception {
        Double result = ts[0];
        if (ts.length==0 & ts ==null){
            return 0.0;
        }
        for (int i = 0; i < ts.length; i++) {
            if (ts[i] < MIN_TEMPERATURE || ts[i] > MAX_TEMPERATURE){
                throw new Exception();
            }
        }

        return 0.0;
    }
}
