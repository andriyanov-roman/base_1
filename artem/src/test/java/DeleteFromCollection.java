import org.junit.Test;

import java.util.ArrayList;
import java.util.Iterator;

/**
 * Created by Programmer on 23.05.2015.
 */
public class DeleteFromCollection {
    ArrayList<Integer> arrayList = new ArrayList<>();

    @Test
    public void deleteFromColl(){
        for (int i = 0; i < 10; i++) {
            arrayList.add(i);
            System.out.print(arrayList.get(i) + ",");
            System.out.print(arrayList.indexOf(arrayList.get(i)));
        }
        System.out.println("\nresult");
        Iterator<Integer> iterator = arrayList.iterator();
        for (int i = 0; i < arrayList.size(); i++) {
            if(i>3&&iterator.hasNext()&&i<7){
                arrayList.remove(i);
            }
            System.out.print(arrayList.get(i) + ",");
            System.out.print(arrayList.indexOf(i));
        }
    }
}
