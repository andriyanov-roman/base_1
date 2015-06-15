import org.junit.Test;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/**
 * Created by Programmer on 01.06.2015.
 */
public class CollectionTest {
    @Test
    public void testArrayList() throws Exception {
        List<String> stringList = new ArrayList<>();
        stringList.add("A");
        stringList.add("B");
        stringList.add("C");
        stringList.add("D");
        Iterator<String> stringIterator = stringList.iterator();//vyzov methoda operatora
        //stringList.remove("A");
        while (stringIterator.hasNext()) {
            if ("A".equals(stringIterator.next())){
                //System.out.println(stringIterator.next());
                stringIterator.remove();
            }
        }
        System.out.println(stringList);
    }
}
