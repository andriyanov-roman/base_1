package ArrayList;

import java.util.Objects;

/**
 * Created by User on 06.06.2015.
 */
public class AlyonasArrayList <T> implements ArrayListSimple {
    private static final int DefaultCapacity = 10;
    private Object[] elements;
    private int size;
    private double loadFactor = 0.75;

    public AlyonasArrayList() {
        elements = new Object[10];
    }


    @Override
    public boolean add(Object o) {
        if (!isSizeSufficient()){
            Object[] newArray = new Object[(elements.length * 3) / 2 + 1];
            System.arraycopy(elements, 0, newArray, 0, elements.length);
            elements = newArray;

        }
        return false;
    }

    private boolean isSizeSufficient() {
        double arrayLoad = (double)size / elements.length;
        if(loadFactor > arrayLoad){
            return true;
        }
        return false;
    }


    @Override
    public void remove(Object o) {

    }

    @Override
    public T getElements(Object o) {
        for (int i = 0; i < size; i++) {
            if (o.equals(elements[i])) {
                return (T) elements[i];
            }
        }
        return null;
    }

    public static void main(String[] args) {
        AlyonasArrayList<String> strings = new AlyonasArrayList<>();
        strings.add("test");
        System.out.println(strings.getElements("test"));
    }


    public void testArrayCopyObject() {
        int size = 7;
        int capacity;
        Object[] arrayOne = new Object[10];
        capacity = arrayOne.length;
        double loadFactor = (double) size / capacity;
        Object[] arrayTwo = new Object[(arrayOne.length * 3) / 2 + 1];
        capacity = arrayTwo.length;
        System.arraycopy(arrayOne, 0, arrayTwo, 0, arrayOne.length);
        System.out.println(arrayTwo.length);
    }

    private void resizeMyList() {
        if (loadFactor >= DefaultCapacity) {

        }
    }


    private int checkCapacity(){
        return DefaultCapacity;
    }
}
