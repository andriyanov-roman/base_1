package coll_test;

import org.junit.Test;

import java.util.ArrayList;
import java.util.Iterator;

/**
 * Created by Programmer on 23.05.2015.
 */
public class CollTest {

    @Test
    public void remObj (){
        ArrayList<Integer> arr = new ArrayList<>();
        for (int i = 0; i < 60; i++) {
            arr.add(i);
        }
        Iterator<Integer> iter = arr.iterator();
        for (int i = 0; iter.hasNext();i++) {
            iter.next();
            if (i>30 & i<40){
                iter.remove();
            }
        }
        // ХАБР - структуры данных

    }
}
