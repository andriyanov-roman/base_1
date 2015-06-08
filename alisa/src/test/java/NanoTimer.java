import java.text.NumberFormat;
import java.util.ArrayList;
import java.util.Locale;

/**
 * Created by admin on 08.06.15.
 */
public class NanoTimer {
    private static long start, stop;

    public static void start() {
        ArrayList<String> array = new ArrayList<String>();
        array.add("A");
        array.add("B");
        array.add("C");
        array.add("D");
        array.add("E");
        array.add("F");
        array.add("G");
        array.add("H");
        array.add("K");

        for (int i = 0; i < array.size(); i++) {

        }
        /*String [] array =  {"A", "B", "C", "D", "E", "F","G", "H", "K"};
        for (int i = 0; i <array.length ; i++) {

        }*/
        start = System.nanoTime();
    }

    public static void stop() {
        stop = System.nanoTime();
        show(stop - start);
    }

    private static void show(long time) {
        System.out.println(String.format(Locale.ENGLISH, "Time: %s ns", NumberFormat.getNumberInstance().format(time)));
    }
}
