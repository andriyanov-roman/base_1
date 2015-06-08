package entities.list;

import java.util.Arrays;
import java.util.Iterator;

/**
 * Created by Programmer on 06.06.2015.
 */
public class DiamondList<T> implements IMyList<Object>, Iterable {
    private Object[] elements;
    private int size = 0;
    private Double maxLoading = 0.75;
    private static final int DEFAULT_CAPACITY = 10;

    public DiamondList() {
        elements = new Object[DEFAULT_CAPACITY];
    }

    public DiamondList(int newInitialCapacity) {
        elements = new Object[newInitialCapacity];
    }

    public Double getMaxLoading() {
        return maxLoading;
    }

    public void setMaxLoading(Double maxLoading) {
        this.maxLoading = maxLoading;
    }

    @Override
    public Boolean add(Object element) {
        if (!isSizeSufficient()) {
            Object[] newArray = new Object[getIncreasedSize()];
            System.arraycopy(elements, 0, newArray, 0, elements.length);
            elements = newArray;
        }
        elements[size] = element;
        size++;
        return true;
    }

    @Override
    public Object remove(int index) {
        if (index>size) {
            throw new ArrayIndexOutOfBoundsException ();
        }
        Object removedElement = elements[index];
        Object[] newArray = new Object[elements.length];
        System.arraycopy(elements,0,newArray,0,index);
        System.arraycopy(elements,index+1,newArray,index,size-index+1);
        elements = newArray;
        size--;
        return removedElement;
    }
    @Override
    public Boolean remove(Object o) {
        for (int i = 0; i < size; i++) {
            if (o.equals(elements[i])){
                remove(i);
                return true;
            }
        }
        return false;
     }
    public Boolean isEmpty() {
        return size == 0;
    }

    private boolean isSizeSufficient() {
        return loadFactor() < maxLoading;

    }
    private Double loadFactor() {
        return size == 0 ? 0.0 : (double) (size / elements.length);
    }


    private void resizeMyList() {
        //if (maxLoading>=defaultCapacity)
    }

    private int checkCapacity() {

        return 0;
    }

    private int getIncreasedSize() {
        return (elements.length * 3) / 2 + 1;
    }

    @Override
    public Iterator iterator() {
        return null;
    }

    @Override
    public String toString() {
        return "DiamondList{" +
                "elements=" + Arrays.toString(elements) +
                ", size=" + size +
                ", maxLoading=" + maxLoading +
                '}';
    }
}
