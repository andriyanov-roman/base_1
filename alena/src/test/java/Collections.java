import org.junit.Test;

import java.util.*;

/**
 * Created by User on 23.05.2015.
 */
public class Collections {

    @Test
    public void testForSet() {
        Set<String> strings = new HashSet<>();
        strings.add("A");
        strings.add("A");
        strings.add("A");
        strings.add("A");
        strings.add("A");
        List<String> stringsList = new LinkedList<>();
        stringsList.add("B");
        stringsList.add("C");
        Iterator<String> iterator = stringsList.iterator();
        while(iterator.hasNext()) {
            System.out.println(iterator.next());

        }
        for (String s: strings) {
            System.out.println(s);
        }


    }

    @Test
    public void newTest() {
        ArrayList<String> testList = new ArrayList<>();
        testList.add("A");
        testList.add("A1");
        testList.add("A2");
        testList.add("A22");
        testList.add("A3");
        testList.add("A33");
        testList.add("A333");
        testList.add("A4");
        testList.add("A5");
        testList.add("A6");
        testList.add("A7");
        testList.add("A8");
        testList.add("A9");
        testList.add("A10");
        testList.add("A11");
        testList.add("A12");
        testList.add("A13");
        testList.add("A14");
        testList.add("A15");
        testList.add("A16");
        testList.add("A");
        testList.add("A1");
        testList.add("A2");
        testList.add("A22");
        testList.add("A3");
        testList.add("A33");
        testList.add("A333");
        testList.add("A4");
        testList.add("A5");
        testList.add("A6");
        testList.add("A7");
        testList.add("A8");
        testList.add("A9");
        testList.add("A10");
        testList.add("A11");
        testList.add("A12");
        testList.add("A13");
        testList.add("A14");
        testList.add("A15");
        testList.add("A16");
        Iterator<String> iterator = testList.iterator();
      int counter = 0;
        while(iterator.hasNext()){
            counter++;
            iterator.next();
            if(counter >15 && counter <30 ) {
                iterator.remove();
            }
        }
        System.out.println(testList);
    }
}
