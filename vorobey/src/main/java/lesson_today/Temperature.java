package lesson_today;

import java.lang.*;

public class Temperature implements ISearchTemperature {
    Double[] array = {-273d, 219.3, 9.3, 123d, -120d, 111d, -0.34, -22.8};

    @Override
    public double closetToZero(double[] array) throws Exception {

        if (array.length == 0)
            return 0;
        for (int i = 0; i < array.length; i++) {
            if (array[i] < 5526 && array[i] > (-273)) {
                throw new Exception();
            } else
                System.out.println("данное число не отвечает данному диапазону");


            if ((0 - array[i]) < (0 - array[i + 1]))
                return array[i];
            else
                return array[i + 1];


        }



        for (int i = (-273); i < 0; i++) {
            double min = 0;
            if (array[i] < min)
                min = array[i];

        }
        for (int i = 0; i < 5526; i++) {
            double min2 = 5526;
            if (array[i] < min2)
                min2 = array[i];

        }


        return 0;

    }


}









