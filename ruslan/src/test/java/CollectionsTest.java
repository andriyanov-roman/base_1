import org.junit.Test;

import java.util.ArrayList;
import java.util.Iterator;

/**
 * Created by Programmer on 23.05.2015.
 */
public class CollectionsTest {


    @Test
    public static void main(String[] args) {

        ArrayList<String> tests = new ArrayList<>();
        tests.add("A");
        tests.add("B");
        tests.add("C");
        tests.add("D");
        tests.add("E");
        tests.add("F");
        tests.add("G");
        Iterator<String> iterator = tests.iterator();
        int counter = 0;
        while (iterator.hasNext()) {
            counter++;
            iterator.next();
            if (counter > 3 && counter < 5) {
                iterator.remove();
            }
        }
        System.out.println(tests);
    }
}
