package base_examples.ArrayHomeTasks;

/**
 * Created by b0gut on 09.03.15.
 */
public class Array_examples {

    public static void main(String[] args) {
        System.out.println("1.------------------------");
        int[] array = new int[10];
        array[0] = 1;
        array[1] = 32;
        array[2] = 6671;
        array[3] = 0;
        array[4] = 8651;
        array[5] = 131;
        array[6] = -1;
        array[7] = 31;
        array[8] = 6671;
        array[9] = 143;
        for (int i = 0; i < array.length; i++) {
            if (array[i] % 2 == 0) {
                System.out.println(array[i]);
            }
        }

        System.out.println("2.------------------------");

        for (int i = array.length - 1; i >= 0; i--) {
            System.out.println(array[i] + " index - " + i);
        }

        System.out.println("3.------------------------");

        for (int i = 0; i < array.length / 2; i++) {
            System.out.println(array[i] + " index - " + i);
        }
        for (int i = array.length / 2; i < array.length; i++) {
            System.out.println(array[i] + " index - " + i);
        }
        System.out.println("4.------------------------");


        for (int i = array.length - 1; i >= 0; i--) {
            System.out.println(array[i] + " index - " + i);
        }

        for (int i = (array.length / 2) - 1; i >= 0; i--) {
            System.out.println(array[i] + " index  - " + i);
        }

        for (int i = array.length - 1; i > array.length / 2; i--) {
            System.out.println(array[i] + " index - " + i);

        }


    }
}


