package lessons.l060415;

import java.util.Comparator;

/**
 * Created by user on 06.04.2015.
 */
class A {
    public void doSomething (){
        System.out.println("A class method");
    }
    public class Inner implements Comparator{
        int i = 5;

        @Override
        public int compare(Object o1, Object o2) {
            return 0;
        }
    }
}
