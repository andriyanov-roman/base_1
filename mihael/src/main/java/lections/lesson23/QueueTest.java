package lections.lesson23;

import java.util.PriorityQueue;

/**
 * Created by Programmer on 06.06.2015.
 */
public class QueueTest {

    public void testQueue(){
        PriorityQueue<String> strings = new PriorityQueue<>();
        strings.add("B");
        strings.add("A");
        strings.add("F");
        strings.add("G");
        strings.add("E");
        strings.add("C");
        String s = strings.peek();
        System.out.println(s);
        System.out.println(strings.size());
        String s1 = strings.poll();
        System.out.println(s1);
        System.out.println(strings.size());

        System.out.println();
    }
}
