import javafx.util.Pair;
import org.junit.Test;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/**
 * Created by mit_OK! on 01.06.2015.
 */
public class CollectionsListTest {

    @Test
    public void test() {
        List<String> strList = new ArrayList<>();
        strList.add("A");
        strList.add("B");
        strList.add("C");
        Iterator<String> stringIterator = strList.iterator();
        //strList.remove("A"); // ConcurrentModificationException
        while (stringIterator.hasNext()){
            if ("A".equals(stringIterator.next())){
                stringIterator.remove(); // удалить єлемент с помощью Итератора
            }
        }
        //Pair
        System.out.println(strList);

    }


}
