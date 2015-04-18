package ua;

/**
 * Created by Администратор on 18.04.2015.
 */
public interface IFly {
    int i = 0;
    public void fly();

    public default void flyDefault() {
        System.out.println();
    }
    public default void flyDefaultTwo() {
        System.out.println();
    }

    public static void staticDoSomething() {

    }
}
