package lections.lection27;

/**
 * Created by Programmer on 20.06.2015.
 */
public class Main {
    public static void main(String [] args){
        A a = new B();
        a.doSome(1);
        a = new A();
        a.doSome(1);

        B b = new B();
        b.doSome(1);
       // B b1 = (B) a;
       // b1.doSome(1);
    }

}
