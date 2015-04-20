package lections.lesson10;


import java.util.ArrayList;

/**
 * Created by Администратор on 18.04.2015.
 */
public interface IReadText {
    public ArrayList<String> getStrings();
    public default void getStrings2(){};
}
