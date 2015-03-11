package loop;


public class LoopMethods {
    public static void loop1000() {
        for (int i = 1000; i < 10000; i += 3) {
            System.out.print(" " + i);
        }


    }

    public static void loopReverse() {
        int k = -1;
        for (int i = 0; i < 55; i++) {
            k += 2;
            System.out.print(" " + k);
        }
    }

    public static void loopMultiplicationToNext() {
        int k = 1;
        for (int i = 0; i < 20; i++) {
            k *= 2;
            System.out.print(" " + k);

        }
    }
}


