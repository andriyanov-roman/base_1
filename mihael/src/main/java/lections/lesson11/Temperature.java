package lections.lesson11;

/**
 * Created by Администратор on 20.04.2015.
 */
public class Temperature implements ISearchTemperature{
    double [] ts = {7,-10,13,8,4,-7.2,-12,-3.7,3.5,-9.6,6.5,-1.7,-6.2,7};
    public static final  int MIN_TEMPERATURE = -273;
    public static final  int MAX_TEMPERATURE = 5526;
    //double [] ts = {7,-10,13,8,4,-7.2,-12,-3.7,3.5,-9.6,6.5,-1.7,-6.2,7,1.7};
    //double [] ts = {7,-10,13,8,4,-7.2,-273,-3.7,5526,-9.6,6.5,-1.7,-6.2,7};
    //double[] ts = {};
    double minPlus;
    double minMinus;
    double result;

    public  double [] getTs(){
        return this.ts;
    };
    @Override
    public  double closeToZero (double[] ts) throws Exception {
        if(ts == null ||ts.length ==0) {
            System.out.println("Array is empty. Return 0.");
        }

        for (int i = 0; i<ts.length; i++){
            if((ts[i] >= MIN_TEMPERATURE) &&(ts[i] <= MAX_TEMPERATURE)){}
            else throw new Exception("Exception- not in range");
        }
        minPlus = MAX_TEMPERATURE +1;
        minMinus = MIN_TEMPERATURE -1;

        for (int i = 0; i<ts.length; i++){

            if((ts[i] < minPlus) &&(ts[i] > 0)){
                minPlus = ts[i];
            }
            if((ts[i] > minMinus) &&(ts[i] < 0)){
                minMinus = ts[i];

            }
        }

        if(minPlus < Math.abs(minMinus)){
            result = minPlus;
        } else  if(minPlus == Math.abs(minMinus)){
            result = minPlus;
        } else result = minMinus;

        return result;
    }


}
