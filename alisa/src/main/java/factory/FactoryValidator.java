package factory;

import java.util.ArrayList;

/**
 * Created by Администратор on 11.04.2015.
 */
public class FactoryValidator {
    private static ArrayList<String> colors;
    static {
        colors.add("Green");
    }

    public boolean checkColor(String color) {
        if(colors.contains(color)) {
            return true;
        }
        return false;
    }

//    public boolean checkColor(int i) {
//        if(i < colors.length) {
//
//        }
//        return false;
//    }

}
