import org.junit.Test;

import java.util.PriorityQueue;

/**
 * Created by Programmer on 06.06.2015.
 */
public class QueueTest {
    @Test
    public void testQueue(){


        PriorityQueue<String > strings = new PriorityQueue<>();
        strings.add("A");
        strings.add("B");
        strings.add("C");
        strings.add("D");
        String s = strings.peek();
        System.out.println(strings.size());
        String s1 = strings.poll();
        System.out.println(strings.size());
    }
    
}
