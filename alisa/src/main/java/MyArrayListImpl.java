import java.util.Arrays;

/**
 * Created by User on 01.06.2015.
 */
public class MyArrayListImpl<T> implements IMyList<T> {
    private Object[] elements;
    private int size = 0;
    private static final int DEFAULT_CAPACITY = 10;
    private static final double LOAD_FACTOR = 0.75;

    public MyArrayListImpl() {
        elements = new Object[DEFAULT_CAPACITY];

    }

   /* public boolean add(Object element){
        elements[size] = element;
        size++;
        ///size+1
        return true;
    }*/


    @Override
    public boolean add(T t) {
        if (!isSufficient()) {
            Object[] newElements = new Object[checkCapacity()];
            System.arraycopy(elements, 0, newElements, 0, elements.length);
            elements = newElements;
        }
        elements[size] = t;
        size++;
        return true;
    }

    private boolean isSufficient() {
        double arrayLoad = (double) size / elements.length;
        return (LOAD_FACTOR > arrayLoad); /* return (LOAD_FACTOR > arrayLoad) ? true:false; - тернарный оператор*/
    }

    private int checkCapacity() {
        return (DEFAULT_CAPACITY * 3) / 2 + 1;
    }

    @Override
    public boolean add(int index, T t) {
        if (isSufficient()) {
            Object[] newElements = new Object[checkCapacity()];
            System.arraycopy(elements, 0, newElements, 0, elements.length);
            elements = newElements;
        }
        Object[] newElements = new Object[size - index];
        System.arraycopy(elements, index, newElements, size - index, elements.length);
        elements[size] = t;
        System.arraycopy(elements, 0, newElements, index + 1, elements.length);
        size++;
        return true;
    }

    @Override
    public boolean remove(T t) {
        for (int i = 0; i < size; i++) {
            if (t.equals(elements[i])) {
                 remove(t);

            }
        }
        return true;
    }



        @Override
        public T getElement (T t){
            for (int i = 0; i < size; i++) {
                if (t.equals(elements[i])) {
                    return (T) elements[i];

                }

            }
            return null;
        }

        @Override
        public T getElement ( int index){
            return (T) elements[index];
        }

        @Override
        public boolean remove ( int index){
            Object[] newElements = new Object[size - index];
            System.arraycopy(elements, index+1, newElements,0, size-index);
            elements[size] = null;
            System.arraycopy(elements, 0, newElements, index, newElements.length);
            size --;
            return true;
        }


    public int size() {
        return size;
    }

    @Override
    public String toString() {
        return "MyArrayListImpl{" +
                "elements=" + Arrays.toString(elements) +
                ", size=" + size +
                '}';
    }
}

