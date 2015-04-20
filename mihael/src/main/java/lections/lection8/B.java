package lections.lection8;

/**
 * Created by user on 06.04.2015.
 */
public class B extends A {
    public static void main(String [] args){
        A a = new B();
        a.doSome();
        a.doSomeNoStat();
    }
    public static void doSome(){
        System.out.print("Class B");
    }
    public  void doSomeNoStat(){
        System.out.print("Class B NoStat");
    }

}
