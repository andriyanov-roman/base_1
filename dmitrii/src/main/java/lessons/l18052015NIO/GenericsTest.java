package lessons.l18052015NIO;

import entities.company.Admin;
import entities.company.Employee;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Programmer on 18.05.2015.
 */
public class GenericsTest {
    public static void main(String[] args) {
        DictionaryPair<String,String> example = new DictionaryPair<>();
        example.setKey("book");
        example.setValue("книга");

        DictionaryPair<String,Integer> exampleTwo = new DictionaryPair<>();
        exampleTwo.setKey("second");
        exampleTwo.setValue(2);

        ArrayList<DictionaryPair> test = new ArrayList<>();
        test.add(example);
        test.add(exampleTwo);

        Integer i = 100;
        getSmthg(i);
        String s = "test";
        //getSmthg(s); ERROR
    }
    public static <E extends Number> void getSmthg (E element){
        System.out.println(element.longValue());
    }
    public static <E> void doSMT (List<? super Admin> list) {
        list.get(0);
    }
}

