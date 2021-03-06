import org.junit.Test;

import java.util.ArrayDeque;
import java.util.PriorityQueue;

/**
 * Created by User on 06.06.2015.
 */
public class QueueTest {

    @Test
    public void testQueue() {
        PriorityQueue<String> strings = new PriorityQueue<>();
        strings.add("A");
        strings.add("B");
        strings.add("C");
        strings.add("D");
        String s = strings.peek();
        System.out.println(s);
        System.out.println(strings.size());
        String s1 = strings.poll();
        System.out.println(s1);
        System.out.println(strings.size());
        ArrayDeque<String> stringArrayDeque = new ArrayDeque<>();
        stringArrayDeque.add("A");
        stringArrayDeque.add("B");
        stringArrayDeque.add("C");
        stringArrayDeque.add("D");
        stringArrayDeque.add("E");

    }

}
