package lections.lection8;

/**
 * Created by user on 06.04.2015.
 */
public class A {
    public static final int NEW_CONSTANT = 10;
    public static int STAT = 10;
    public static void main(String [] args){
        STAT = 10;
        A a = new B();
        a.doSome();
        a.doSomeNoStat();
    }
    public static void doSome(){
        System.out.print("Class A");
    }
    public  void doSomeNoStat(){
        System.out.print("Class A NoStat");
    }
    public  final void doSomeFinal(){
        System.out.print("Class A NoStat");
    }


}
