import org.junit.Test;

/**
 * Created by admin on 08.06.15.
 */
public class MyArrayListTest {
   @Test
    public void testArrayList(){
       MyArrayListImpl <String> array = new MyArrayListImpl<>();
       array.add("A");
       array.add("B");
       array.add("C");
       array.add("D");
       for (int i = 0; i < array.size(); i++) {
       }
       System.out.println(array);
    }
}
