package lections.lesson11;

/**
 * Created by Администратор on 20.04.2015.
 */
public class TemperatureRun {
    static double [] ts ;
    static double result;
    public static void main (String args[]) throws Exception {
        Temperature temperature = new Temperature();
        ts = temperature.getTs();
        result = temperature.closeToZero(ts);
        System.out.println(result);
    }


}
