package lessons.l18042015;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

/**
 * Created by user on 18.04.2015.
 */
public class MainInterFaceSort implements Comparator{
    public static void main(String[] args) {
        Double d = new Double(30.0);
        d.compareTo(25.0);
        String s = "dfsfsdf";
        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5, 6);
        numbers.forEach(System.out::println);

    }
    @Override
    public int compare(Object o1, Object o2) {
        return 0;
    }
}
