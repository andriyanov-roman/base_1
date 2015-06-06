package lessons.l23052015Collections;

import java.util.ArrayList;
import java.util.PriorityQueue;

/**
 * Created by Programmer on 06.06.2015.
 */
public class Queue060615 {
    public static void main(String[] args) {
        PriorityQueue<String> strings = new PriorityQueue<>();
        strings.add("A");
        strings.add("B");
        strings.add("C");
        strings.add("D");
        strings.add("E");
        String s = strings.peek();
        System.out.println(s);
        System.out.println(strings.size());
        String s1 = strings.poll();
        System.out.println(s1);
        System.out.println(strings.size());
        ArrayList a = new ArrayList();
    }
}
