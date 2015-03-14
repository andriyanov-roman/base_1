/**
 * Created by user on 09.12.2014.
 */
public class LessonSix {
    public static void main(String[] args) {
        int[] array = new int[10];
        array[0] = 1;
        array[1] = 11;
        array[2] = 111;
        array[3] = 1111;
        array[4] = 11111;
        array[5] = 111111;
        array[6] = 11222;
        array[7] = 1122;
        array[8] = 112;
        array[9] = 12;
        System.out.println(array.length);
        int[] arrayTwo = {1, 4, 6, 8, 8, 10};
        System.out.println(arrayTwo[4]);
        System.out.println(array[1] + array[2]);

        for (int o = 0; o < array.length; o++) {
            System.out.println(array[o] + "index ->" + o);
        }

        int[] arrayTree = {3, 7, 8, 9, 11, 12, 13, 44, 56, 67};
        for (int i = 0; i < array.length / 2; i++ ) {
            System.out.println(array[i]);
        }

        for (int part = array.length/2; part < array.length; part++ ) {
            System.out.println(array[part]);
        }
        System.out.println("---------------------");
        for (int i = array.length - 1; i >=0; i--) {
            System.out.print(array[i] + " ");
        }

        for (int i = 0; i < array.length; i+=2) {
            System.out.println(array[i]);
        }

        for (int i = array.length - 1; i > (array.length-1)/ 2; i--) {
            System.out.println(array[i] +  " " + "first part");
        }

        for (int i = (array.length-1)/2; i >= 0; i--) {
            System.out.println(array[i] + " " + "second part");
        }
        int sum = 0;

        for (int i = 0; i < array.length; i++) {
            sum = array[i] + sum;
        }

        System.out.println(sum);


        int sum1 = 0;
        for (int i = 0; i < array.length/2; i++ ) {
            sum1 = array[i] + sum1;
            int sum2 = sum1 / array.length;
            System.out.println(sum2);
        }




    }

}
