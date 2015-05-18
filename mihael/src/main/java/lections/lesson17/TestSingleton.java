package lections.lesson17;

/**
 * Created by Администратор on 11.05.2015.
 */
public class TestSingleton {
    static public  void  main (String[] args){
        Sin2 sin = Sin2.getInstance();
        System.out.println(sin);
        Sin2 sin2 = Sin2.getInstance();
        System.out.println(sin2);

        Object obj1 = new Object();
        System.out.println(obj1);
        Object obj2 = new Object();
        System.out.println(obj2);
    }
}
