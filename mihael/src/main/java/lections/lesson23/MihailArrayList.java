package lections.lesson23;

/**
 * Created by Programmer on 06.06.2015.
 */
public class MihailArrayList<T> implements MihailList<T> {
    private Object[] array;
    private int size=0;
    private int length=16;
    private int capacity;
    private double loadFactor =0.7;

    public MihailArrayList (){
        array = new Object[length];
    }

    public int getSize() {
        return size;
    }

    @Override
    public void add(T o) {
        array[size] = o;
        size++;
    }

    @Override
    public T get(int index) {
        return (T)array[index];
    }

    @Override
    public void remove(T o) {

    }

    @Override
    public void remove(int index) {

    }

    private void testArrayCopy(){
        loadFactor = (double)size/capacity;
        System.out.println();
    }

}
