package OLD_Arrayes;

/**
 * Created by user on 09.12.2014.
 */
public class Arrays { //ARRAY
    public static void main(String[] Args) {
        int[] array = new int[10];
        array[0] = 1;
        array[1] = 31;
        array[2] = 6671;
        array[3] = 143;
        array[4] = 8651;
        array[5] = 131;
        array[6] = 6561;
        array[7] = 841;
        array[8] = 12334;
        array[9] = 135;
        for (int i = 0; i < array.length; i++) {
            System.out.println(array[i] + "  index->" + i);
        }
        System.out.println(array[0] + array[1] + array[3]);
        int[] arrayTwo = {1, 4, 6, 7, 8, 9, 10};

        System.out.println(arrayTwo.length);
        System.out.println(arrayTwo[6]);

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
        for (int i = arrayReverse.length-1 ; i > 0 ; i--) {
            System.out.println(arrayReverse[i] + " index" + i);
        }
        System.out.println("-----reverse First Part");
        int[] arrayRFP = {23, 676, 658, 978, 890, 34, 23, 908, 98, 12};
        for (int i = arrayRFP.length-1 ; i > arrayRFP.length/2 ; i--) {
            System.out.println(arrayRFP[i] + " index" + i);
        }
        System.out.println("-----reverse Second Part");
        int[] arrayRSP = {23, 676, 658, 978, 890, 34, 23, 908, 98, 12};
        for (int i = arrayRSP.length/2-1 ; i >= 0 ; i--) {
            System.out.println(arrayRFP[i] + " index" + i);
        }
        System.out.println("-----Every second number");
        int[] arrayESN = {23, 676, 658, 978, 890, 34, 23, 908, 98, 12};
        for (int i = 0 ; i < arrayESN.length  ; i=i+2) {
            System.out.println(arrayESN[i] + " index" + i);
        }
        System.out.println("-----SUM");
        int[] arraySUM = {23, 676, 658, 978, 890, 34, 23, 908, 98, 12};
        int sum =0;
        for (int i = 0 ; i < arraySUM.length ; i++) {
            sum=arraySUM[i];

        }
    }
}