/**
 * Created by vlas on 11.12.2014.
 */
public class HomeTaskArrays {
    public static void main(String[] Args) {
        System.out.println("-----First Part of array");
        int[] arrayFP = {23, 676, 658, 978, 890, 34, 23, 908, 98, 12};
        for (int i = 0; i < arrayFP.length / 2; i++) {
            System.out.println(arrayFP[i] + " index" + i);
        }
        System.out.println("-----Second Part of array");
        int[] arraySP = {23, 676, 658, 978, 890, 34, 23, 908, 98, 12};
        for (int i = arraySP.length / 2; i < arraySP.length; i++) {
            System.out.println(arraySP[i] + " index" + i);
        }
        System.out.println("-----reverse");
        int[] arrayReverse = {23, 676, 658, 978, 890, 34, 23, 908, 98, 12};
        for (int i = arrayReverse.length - 1; i > 0; i--) {
            System.out.println(arrayReverse[i] + " index" + i);
        }
        System.out.println("-----reverse First Part");
        int[] arrayRFP = {23, 676, 658, 978, 890, 34, 23, 908, 98, 12};
        for (int i = arrayRFP.length - 1; i > arrayRFP.length / 2; i--) {
            System.out.println(arrayRFP[i] + " index" + i);
        }
        System.out.println("-----reverse Second Part");
        int[] arrayRSP = {23, 676, 658, 978, 890, 34, 23, 908, 98, 12};
        for (int i = arrayRSP.length / 2 - 1; i >= 0; i--) {
            System.out.println(arrayRFP[i] + " index" + i);
        }
        System.out.println("-----Every second number");
        int[] arrayESN = {23, 676, 658, 978, 890, 34, 23, 908, 98, 12};
        for (int i = 0; i < arrayESN.length; i = i + 2) {
            System.out.println(arrayESN[i] + " index" + i);
        }
        System.out.println("-----SUM of elements");
        int[] arraySUM = {23, 676, 658, 978, 890, 34, 23, 908, 98, 12};
        int sum = 0;
        for (int i = 0; i < arraySUM.length; i++) {
            sum = sum + arraySUM[i];
        }
        System.out.println(sum);

        System.out.println("-----Arithmetic mean 1 part");
        int sum1 = 0;
        for (int i = 0; i < arraySUM.length / 2; i++) {
            sum1 = sum1 + arraySUM[i];
        }
        int i = arraySUM.length / 2;
        System.out.println(sum1 = sum1 / i);


        System.out.println("-----Arithmetic mean 2 part");
        int sum2 = 0;
        for (; i < arraySUM.length; i++) {
            sum2 = sum2 + arraySUM[i];
        }
        i = arraySUM.length / 2;
        System.out.println(sum2 = sum2 / i);

        System.out.println("-----Arithmetic mean biggest");
        if (sum2 < sum1) {
            System.out.println(sum1 + " Arithmetic mean of 1 array part is Biggest");
        } else if (sum2 > sum1) {
            System.out.println(sum2 + " Arithmetic mean of 2 array part is Biggest");
        }
        System.out.println("--Find min and max from array--");
        int[] array = new int[]{23, 676, -658, 978, -890, 34, 23, 908, 23, 908};
        int min = array[0];
        int max = array[0];
        i = 0;
        for (; i < array.length; i++) {
            if (max < array[i]) {
                max = array[i];
            }
            if (min > array[i]) {
                min = array[i];
            }
        }
        System.out.println(max);
        System.out.println(min);

        System.out.println("--Replace all negative numbers to zero--");
        i = 0;
        for (; i < array.length; i++) {
            if (array[i] < 0)
                array[i] = 0;
            System.out.println(array[i]);
        }
        System.out.println("--Find the same number in the one-dimensional array--");
        i = 0;
        int temp;
        for (; i < array.length; i++) {
            for (int j = 0; j <array.length ; j++) {
                if (array[i]>array[j]){
                    temp = array [i];
                    array[i]=array[j];
                    array[j]=temp;
                }
            }
            int counter = 1;
            temp = array[0];
            i=1;
            for (; i < array.length; i++) {
                if (temp == array [i]){counter++;}
                else
                {
                    if (counter >=2)break;
                    counter=1;
                    temp=array[i];
                }

            }
            System.out.println("в массиве "+counter+" одинаковых элементов");
        }

    }
}




