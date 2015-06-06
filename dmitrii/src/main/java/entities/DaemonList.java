package entities;

import java.util.Arrays;

/**
 * Created by mit_OK! on 01.06.2015.
 */
public class DaemonList {
    private int capacity;
    public static final int DEFAULT_CAPACITY = 10;
    private Object array[];
    private int size;

    public DaemonList() {
        this.array = new Object[DEFAULT_CAPACITY];
        this.capacity = array.length;
        this.size = 0;
    }

    public DaemonList(int initCapacity) {
        this.array = new Object[initCapacity];
        this.capacity = initCapacity;
        this.size = 0;
    }

    public Boolean add(Object o) {
        ensureCapacity();
        Object[] tempArr = array;
        array = new Object[capacity];
        System.arraycopy(tempArr, 0, array, 0, tempArr.length);
        array[size] = o;
        size++;
        return true;
    }

    private void ensureCapacity() {
        if (size / capacity > 0.75) {
            capacity = (capacity * 3) / 2 + 1;
        }

    }

    public Object get(int index) {
        try {
            Object tempEl = array[index];
            return tempEl;
        } catch (ArrayIndexOutOfBoundsException e) {
            e.printStackTrace();
            return null;
        }
    }

    public int size() {
        return size;
    }

    public void remove(int index) {
        try {
            if (index > size) {
                throw new ArrayIndexOutOfBoundsException();
            }
        } catch (ArrayIndexOutOfBoundsException e) {
            e.printStackTrace();
            return;
        }

    }

    @Override
    public String toString() {
        return "DaemonList{" +
                "array=" + Arrays.toString(array) +
                ", size=" + size +
                ", capacity=" + capacity +
                '}';
    }
}
