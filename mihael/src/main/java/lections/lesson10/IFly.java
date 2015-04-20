package lections.lesson10;

/**
 * Created by Администратор on 18.04.2015.
 */
public interface IFly {
    public void iCanFly();

    public default  void flyDefault(){};
    public default  void flyDefaultTwo(){};
    public static   void staticDoSome(){};
}