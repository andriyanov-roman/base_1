package collection;

/**
 * Created by User on 06.06.2015.
 */
public class MyListImpl<T> implements IMyList<T> {
    private int defaultCapacity = 10;
    private Object[] elements;
    private int size = 0;
    private double loadFactor = 0.75;

    public MyListImpl() {
        elements = new Object[defaultCapacity];
    }

    @Override
    public boolean add(T t) {
        if(!isSizeSufficient()) {
            Object[] newArray
                    = new Object[(elements.length * 3) / 2 + 1];
            System.arraycopy(elements, 0, newArray, 0, elements.length);
            elements = newArray;
        }
        elements[size] = t;
        size++;
        return true;
    }

    @Override
    public T get(T t) {
        for (int i = 0; i < size; i++) {
            if(t.equals(elements[i])) {
                return (T)elements[i];
            }
        }
        return null;
    }

    public T get(int index) {
        return (T)elements[index];
    }

    public int size() {
        return size;
    }

    @Override
    public boolean remove(T t) {
        return false;
    }

    private boolean isSizeSufficient() {
        double arrayLoad = (double)size/elements.length;
        if(loadFactor > arrayLoad) {
            return true;
        }
        return false;
    }

    private int checkCapacity() {
        return (defaultCapacity * 3)/2 + 1;
    }
}
