/**
 * Created by user on 11.12.2014.
 */
public class LessonSeven {
//    public static void main(String[] args) {
//        showLines("Test one", 10);
//        showLines("Test two", 20);
//        showLines("Test tree", 30);
//
//    }
//    public static void showLines(String text, int counter) {
//        for (int i = 0; i < counter; i++) {
//            System.out.println(text);
//        }
//    }


//    public static void main(String[] args) {
//        int one = 5;
//        int two = 6;
//        int three = one + two;
//        System.out.println(three);
//
//    }
//
//
//    public static int summary (int one, int two ) {
//        return one + two;
//
//    }

//    public static void main(String[] args) {
//        int[] array = makeArray();
//        int[] arrayTwo = new int[10];
//
//    }
//
//
//
//
//        public static int [] makeArray() {
//            return new int [] {1,2,3,3,4,5,5,5,56};
//    }
//
//
//    public static void makeArrayVoid (int[] array) {
//        array[0] = 1;
//        array[1] = 11;
//        array[2] = 111;
//        array[3] = 1111;
//        array[4] = 11111;
//
//    }

    public static void main(String[] args) {
        int [] arrayFirst = new int [] {5,30,3,8,4,1,5,5,56};

        int max = arrayFirst[0];
        int min = arrayFirst[0];

        for (int i = 0; i <arrayFirst.length ; i++) {
            if (arrayFirst[i] > max) {
                max = arrayFirst[i];
            }
            if (arrayFirst[i] < min) {
                min = arrayFirst[i];
            }
        }
        System.out.println( min + "is the min");
        System.out.println(max + "is the max");
    }




}
