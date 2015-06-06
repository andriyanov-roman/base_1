import entities.DaemonList;
import org.junit.Test;

/**
 * Created by Programmer on 06.06.2015.
 */
public class MyArrayTest {
    @Test
    public void testArray(){
        DaemonList list = new DaemonList();
        list.add("A");
        list.add("B");
        list.add("C");
        list.add("D");
        list.add("E");
        list.add("E");
        list.add("E");
        list.add("E");
        list.add("E");
        list.add("E");
        list.add("E");
        list.add("E");
        list.add("E");
        list.add("E");
        list.add("E");
        list.add("E");
        list.add("E");
        list.add("E");
        list.add("E");
        list.add("E");
        list.add("E");
        list.add("E");
        System.out.println(list);
    }
}
