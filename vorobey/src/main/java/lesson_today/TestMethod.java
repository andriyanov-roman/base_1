package lesson_today;


public class TestMethod {


    @Test
    public void closetToZero() throws Exception {
        double[] array = {};
        double tmp;
        if (array.length == 0) {

        }
        for (int i = 0; i < array.length; i++) {
            if (array[i] < 5526 && array[i] > (-273)) {
                throw new Exception();
            } else
                System.out.println("данное число не отвечает данному диапазону");
            if ((0 - array[i]) < (0 - array[i + 1])) {
                tmp = array[i];
            } else
                tmp = array[i + 1];
        }


    }
}
