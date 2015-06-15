import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Programmer on 06.06.2015.
 */


public class SimpleList<E> {
    private List<E> backingStore;
    public SimpleList() {
        backingStore = new ArrayList<E>();
    }
    public E add(E e) {
        if (backingStore.add(e))
            return e;
        else
            return null;
    }
    public int size() {
        return backingStore.size();
    }
    public void clear() {
        backingStore.clear();
    }
}




