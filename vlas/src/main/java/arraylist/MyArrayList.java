package arraylist;

/**
 * Created by Programmer on 18.05.2015.
 */
public class MyArrayList <E> {
    private int size = 0;
   private Object [] elements = new Object[10];

    public Object[] getArray() {
        return elements;
    }

    public void setArray(Object[] array) {
        this.elements = array;
    }
    public void add(E element) throws Exception {
        if (size >= 10) {
            throw new Exception("capasity is full");
        }
        elements[size] = element;
        size++;
    }
    public E get(int index) {
        if (index < 0 || index >= size) {
            throw new IndexOutOfBoundsException();
        }
        return (E) elements[index];
    }

    public int size() {
        return size;
    }
}
