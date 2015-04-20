package epamExam;


import java.io.IOException;

public class Temperature implements ISearchTemperature {
    Double[] ts = {-20.0, -273.0, -15.0, -77.0, -16.0};

    int i = 0;


    @Override
    public double closetToZero(double[] ts) throws Exception {
        if (ts.length == 0) {
            return 0;
        }
        double minOtr = -273;
        double minPol=ts[0];
        for (int i = 0; i < ts.length; i++) {
            if ((ts[i]-0) >0 && ts[i]<=minPol) {
                minPol = ts[i];
            }
        }
        for (int i=0;i<ts.length;i++){
            if ((ts[i]-0) <0 && ts[i]>=minOtr) {
                minOtr = ts[i];
            }
        }
        if(Math.abs(minOtr)==Math.abs(minPol)){
            System.out.println(minPol);
        }

        for (i = 0; i < ts.length; i++) {
            if (ts[i] < -273 || ts[i] > 5526) {
                throw new Exception();
            }

        }
        return 0;

    }

}
