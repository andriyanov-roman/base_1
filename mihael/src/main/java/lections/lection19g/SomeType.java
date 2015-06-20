package lections.lection19g;

import java.util.Collection;
import java.util.List;

/**
 * Created by Администратор on 20.05.2015.
 */
public class SomeType<T> {
    public <E> void test (Collection<E> collection) {
        System.out.println("Collection method");
        for (E e : collection){
           System.out.println(e);
        }
    }

    public void test (List<Integer> integerList) {
        System.out.println("integer method");
        for(Integer integer: integerList) {
            System.out.println(integer);
        }
    }

}
