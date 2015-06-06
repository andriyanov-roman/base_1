package jsoup_test;

import collection.MyListImpl;
import org.junit.Test;

/**
 * Created by User on 06.06.2015.
 */
public class SystemCopyTests {

    @Test
    public void testArrayCopyObject() {
        int size = 7;
        int capacity;
        Object[] arrayOne = new Object[10];
        arrayOne[0] = "test";
        arrayOne[1] = "test";
        arrayOne[2] = "test";
        arrayOne[3] = "test";
        capacity = arrayOne.length;
        double loadFactor = (double) size / capacity;
        System.out.println(loadFactor);
        Object[] arrayTwo
                = new Object[(arrayOne.length * 3) / 2 + 1];
        capacity = arrayTwo.length;
        System.arraycopy(arrayOne, 0, arrayTwo, 0, arrayOne.length);
        System.out.println(arrayTwo.length);
        for (Object o : arrayTwo) {
            System.out.println(o);
        }
    }

    @Test
    public void testMyList() {
        MyListImpl<String> list = new MyListImpl<>();
        list.add("A");
        list.add("A");
        list.add("A");
        list.add("A");
        list.add("A");
        list.add("A");
        list.add("A");
        list.add("A");
        list.add("A");
        list.add("A");
        list.add("A");
        list.add("C");
        list.add("A");
        list.add("A");
        list.add("A");
        list.add("A");
        System.out.println(list.size());
        for (int i = 0; i < list.size(); i++) {
            System.out.println(list.get(i));
        }
        System.out.println(list.get("D"));
    }
}
