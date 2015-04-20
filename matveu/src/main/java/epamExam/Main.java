package epamExam;

import java.math.*;

public class Main {

    public static void main(String[] args) throws Exception {
        double[] ts = {-20.0, -273.0, -15.0, 77.0, -16.0};

        double result = new Temperature().closetToZero(ts);
        System.out.println(result);
    }
}