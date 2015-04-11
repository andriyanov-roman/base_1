package lesson_06_04;

/**
 * Created by Kirill on 06.04.2015.
 */
public class B extends A{

    public void doSomething () {

        System.out.println(" Class B");
    }

    public static void main(String[] args) {
        A a = new B();
        a.doSomething();

    }

}
