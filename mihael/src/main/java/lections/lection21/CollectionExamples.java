package lections.lection21;

import java.util.*;

/**
 * Created by Programmer on 23.05.2015.
 */
public class CollectionExamples
{

    public static void main(String[] args){
        Set<String> strings = new HashSet<>();
        strings.add("A");
        strings.add("A");
        strings.add("A");
        strings.add("A");
        strings.add("A");
        for (String s : strings){
            System.out.println(s);
        }
        List<String> stringList = new LinkedList<>();
        /*
        Iterator<String > iterator = stringList.iterator();
        while (iterator.hasNext()){
            System.out.println(iterator.next());
        }
        */
        strings.add("A");
        strings.add("B");
        strings.add("C");
        strings.add("D");
        strings.add("E");
        strings.add("F");
        strings.add("G");
        strings.add("H");
        strings.add("I");
        for(int i =0; i <stringList.size();i++){
            if (i>3 && i<6 ){
                stringList.remove(i);
                i--;
            }
        }
        System.out.println("---------------------------");
        for (String s : strings){
            System.out.println(s);
        }
        Iterator<String > iterator2 = stringList.iterator();
        int counter =0;
        while (iterator2.hasNext()){
            counter++;
            iterator2.next();
            System.out.println(counter);
            if (counter>3 && counter<6 ){

                System.out.println("Removing");
                iterator2.remove();
            }
            System.out.println(iterator2.next());
        }
        System.out.println("---------------------------");
        for (String s : strings){
            System.out.println(s);
        }

    }

}
