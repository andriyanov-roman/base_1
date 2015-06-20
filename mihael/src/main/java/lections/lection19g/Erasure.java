package lections.lection19g;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * Created by Администратор on 20.05.2015.
 */
public class Erasure {
    public static void main (String [] args){
        //SomeType someType = new SomeType();

        SomeType<?> someType = new SomeType();
        List<String> list = Arrays.asList("value");
        someType.test(list);

        ///

        List<String> lstr = new ArrayList<>();
        //compile error
        // List<Object> lobj = lstr;
    }
}
