import org.junit.Test;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/**
 * Created by User on 23.05.2015.
 */
public class RemoveTest {

    @Test
    public void removeElements() {

        List<String> stringList = new ArrayList<>();
        stringList.add("A");
        stringList.add("B");
        stringList.add("C");
        stringList.add("D");
        stringList.add("E");
        stringList.add("F");
        stringList.add("G");
        stringList.add("H");
        stringList.add("K");
        stringList.add("L");
        stringList.add("M");
        stringList.add("N");


        Iterator<String> iterator = stringList.iterator();
        int counter = 0;
        while(iterator.hasNext()){
            counter++;
            iterator.next();
            if(counter > 3 && counter <7){
                iterator.remove();
            }

    }

        System.out.println(stringList);
    }

}
