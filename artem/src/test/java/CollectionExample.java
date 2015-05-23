import org.junit.Test;

import java.util.*;

/**
 * Created by Programmer on 23.05.2015.
 */
public class CollectionExample {

    @Test
    public void testForSet(){
        Set<String> strings = new HashSet<>();
        strings.add("A");
        strings.add("A");
        strings.add("A");
        strings.add("A");
        strings.add("A");
        List<String> stringList = new LinkedList<>();
        stringList.add("B");
        stringList.add("C");
        stringList.add("D");
        stringList.add("E");
        stringList.add("F");
        stringList.add("G");
        for (int i = 0; i < stringList.size(); i++) {
            if(i > 3 && i < 6){
                stringList.remove(i);
            }
        }
        Iterator<String> iterator = stringList.iterator();
        while (iterator.hasNext()){
            System.out.println(iterator.next());
        }
    }
}

/*Node -- вложенный(статический) (не внутренний (не статический))клас в LinkedList
*   item = value "B"
*   next = value "C"
*   prev =
* Node
*   item = "C"
*   next = "D"
*   prev = "B"
*
*
* */
