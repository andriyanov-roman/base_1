package lections.lection29;

import java.util.DoubleSummaryStatistics;

/**
 * Created by Programmer on 27.06.2015.
 */
public class lection29 {
    public static void main(String [] args){
        float f = 0.324F;
        double d = 0.324;
        System.out.println(f==d);
        double a = 3.14E+01;
        System.out.println(a);
        System.out.println(0.0/0);//NaN
        //System.out.println(0/0);//java.lang.ArithmeticException: / by zero
        System.out.println(1.0/0);//Infinity
        System.out.println(-1.0/0);//

        System.out.println(Double.NEGATIVE_INFINITY == Float.POSITIVE_INFINITY);//
        System.out.println(Float.NaN==Float.NaN);//
        String s = "yes";
        Integer i = 10;
        //i.valueOf(s);
//        i.getInteger(s);
//        i.parseInt(s);
        System.out.println(Double.MAX_VALUE);//
        System.out.println(Double.MIN_VALUE);//
        System.out.println(0.0 == Double.MIN_VALUE);// false
        System.out.println(4.9E-324 == Double.MIN_VALUE);// true

        int numFloats = 0;
        float x = 1.0F;
        while (x<=2.0) {
            numFloats++;
            System.out.println(x);
            x = Math.nextUp(x);//0.0000001 unity of list persiption единица точности.
        }

        ;

    }
    public static strictfp  double doSome(){
        return  1/3;
    }
}
