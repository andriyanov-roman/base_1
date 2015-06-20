package lections.lection19g;


import introduction.Array;

import java.util.ArrayList;
import java.util.HashMap;

/**
 * Created by Администратор on 19.05.2015.
 */

public class App {
    public class Animal{}
    public static void main(String []args){

        float value = 100.2F;
        //before Java 5
        ArrayList list = new ArrayList();
        list.add("apple");
        list.add("banana");
        list.add("orange");
        String fruit = (String)list.get(1);
        System.out.println(fruit);

        /// modern style

        ArrayList<String> strings = new ArrayList<String>();
        strings.add("cat");
        strings.add("dog");
        strings.add("alligator");

        String animal = strings.get(1);
        System.out.println(animal);

        // There can be more than one argument

        HashMap<Integer,String> map = new HashMap<Integer,String>();

        // Java 7 style

        ArrayList<Animal> someList = new ArrayList<>();
    }
}
