package lections.lection19g;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Администратор on 20.05.2015.
 */
public class RawTypes {
    public static void main(String [] args) {
        List rawList = new ArrayList();
        List<String> list = new ArrayList<>();

        rawList = list;
        rawList.add(8);

        String s = list.get(0);
    }
}
