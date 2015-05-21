package iotests.niotests;


import generics.DictionaryExample;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class PathTestExample {
    public static void main(String[] args) {
        DictionaryExample<String, String> example = new DictionaryExample<>();
        example.setFirst("book");
        example.setSecond("книга");
        DictionaryExample<Integer, String> exampleTwo = new DictionaryExample<>();
        exampleTwo.setFirst(1);
        exampleTwo.setSecond("книга");
        DictionaryExample exampleThree = new DictionaryExample();
        ArrayList<DictionaryExample> examples = new ArrayList<>();
        examples.add(example);
        examples.add(exampleTwo);
        String g = new String("test");
        Scanner scanner = new Scanner(System.in);
        Integer i = 100;
        List<Integer> list = new ArrayList<>();
        List<Object> listObj = new ArrayList<>();
        getSomething(listObj);
        String test = "test";


    }

    public static void  getSomething(List<? super Integer> numb) {

    }
}
