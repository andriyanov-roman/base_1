package lesson_work_2;


import lesson_today.Test;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Main {

    @Test

    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        list.add("1");
        list.add("2");
        list.add("3");
        list.add("4");
        Iterator<String> stringIterator = list.iterator();

        while (stringIterator.hasNext()) {
            System.out.println(stringIterator.next());
        }

    }
}

