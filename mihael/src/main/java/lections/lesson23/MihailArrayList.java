package lections.lesson23;

/**
 * Created by Programmer on 06.06.2015.
 */
public class MihailArrayList<T> implements MihailList<T> {
    private Object[] array;
    private int size=0;
    private int length=2;
    private double loadFactor = 0.7;
    //capacity = length;

    public MihailArrayList (){
        array = new Object[length];
    }

    public int getSize() {
        return size;
    }

    @Override
    public void add(T o) {
        if(!isArraySufficient()){
            length = (length*3/2 + 1);
            Object[] newArray = new Object[length];
            System.arraycopy(array,0,newArray,0,array.length);
            array=newArray;
            System.out.println("Array is copied"+" new size: " + length );
        }
        array[size] = o;
        size++;
    }

    @Override
    public T get(int index) {
        return (T)array[index];
    }

    @Override
    public boolean remove(T o) {
        return true;

    }

    @Override
    public boolean remove(int index) {
        return true;
    }

    private void testArrayCopy(){
        loadFactor = (double)size/length;
        System.out.println();
    }

    private boolean isArraySufficient (){
        if(size/length>loadFactor){
            return false;
        }
        return true;
    }

}
