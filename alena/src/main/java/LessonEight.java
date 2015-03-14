/**
 * Created by user on 16.12.2014.
 */
public class LessonEight {
//    public static void main(String[] args) {
//        int[] arrayzzz = {1, 1, 3, 4, 5, 1, 7, 8, 9};
//        changeMinMax(arrayzzz);
//        fucK(10, 60);
//        countDuplicates(arrayzzz);
//    }
//
//    private static void countDuplicates(int[] arrayzzz) {
//        int counter = 0;
//
//        for (int i = 0; i < arrayzzz.length; i++) {
//            for (int j = 0; j < arrayzzz.length; j++) {
//                if (arrayzzz[i] == arrayzzz[j]){
//
//                    counter++;
//                }
//
//            }
//            if (counter == 1) {
//                System.out.println(arrayzzz[i] + "not repeats");
//            } else {
//                System.out.println(arrayzzz[i] + "   " + counter);
//            }
//
//            counter = 0;
//
//        }
//
//    }
//
//    public static void changeMinMax( int[] array){
//        int max = array[0];
//        int min = array[0];
//        int minIndex = 0;
//        int maxIndex = 0;
//
//        for (int i = 0; i < array.length; i++) {
//            if (array[i] > max){
//                max = array[i];
//                maxIndex = i;
//            }
//            if (array[i] < min) {
//                min = array[i];
//                minIndex = i;
//            }
//
//
//        }
//
//        int temp = array[minIndex];
//        array[minIndex] = array[maxIndex];
//        array[maxIndex] = temp;
//
//        for (int i = 0; i < array.length; i++) {
//            System.out.println(array[i]);
//
//        }
//        System.out.println();
//
//
//    }
//
//
//
//    public static void fucK (int i, int i1) {
//        for (int j = i; j < i1; j++) {
//
//            System.out.println(j);
//        }
//
//
//    }
    public static void main (String[] args) {
        int a = 5;
        int b = 10;
        int v = 0;
        Changeab(a, b, v);
        System.out.println(a + "   " +  b);
    }


    public static void Changeab (int a1, int b1, int v){
        b1 = v;

        for (int i = b1; i > a1; i--) {
         b1--;
        }
        System.out.println(b1);



        for (int j = a1-1;j <= v; j++ ) {
            a1++;
        }
        System.out.println(a1);

    }

}
