import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

/**
 * Created by Programmer on 23.05.2015.
 */
public class TestIter {
    public static void main(String[] args) {

        List strings = new ArrayList<>();
        strings.add(0);
        strings.add(1);
        strings.add(2);
        strings.add(3);
        strings.add(4);
        strings.add(5);
        strings.add(6);
        strings.add(7);
        strings.add(8);
        strings.add(9);
        strings.add(10);
        strings.add(110);
        strings.add(111);
        strings.add(112);
        strings.add(113);
        strings.add(114);
        strings.add(115);
        strings.add(116);
        strings.add(117);
        strings.add(118);
        strings.add(119);
        strings.add(1110);

        Iterator<String> iterator = strings.iterator();
        for (int counter = 0; iterator.hasNext(); counter++) {
            iterator.next();
            if (counter > 5 && counter < 15){
                iterator.remove();

            }
        }
        System.out.println(strings);

    }
}
