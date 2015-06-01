package arraylist;

/**
 * Created by Programmer on 18.05.2015.
 */
public class MyArrayList <E> {
   private Object [] array = new Object[10];

    public Object[] getArray() {
        return array;
    }

    public void setArray(Object[] array) {
        this.array = array;
    }
    public boolean add (E e){
        array[0] =e;
        return true;
    }
    public E get (int index) {
        return  (E)array[index];
    }
}
