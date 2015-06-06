/**
 * Created by User on 01.06.2015.
 */
public class MyArrayListImpl<T> implements IMyList<T> {
    private Object [] elements;
    private int size = 0;
    private int defaultCaapacity = 10;
    private double loadFactor = 0.75;

    public MyArrayListImpl() {
        elements = new Object[defaultCaapacity];

    }

   /* public boolean add(Object element){
        elements[size] = element;
        size++;
        ///size+1
        return true;
    }*/

    private boolean isSufficient(){
        double arrayLoad = (double) size/elements.length;
        if (loadFactor > arrayLoad){
return true;
        }
        return false;
    }
    private int checkCapacity(){
        return (defaultCaapacity * 3)/2+1;
    }

    @Override
    public boolean add(T t) {
        if (!isSufficient()){

            Object [] newArray = new Object[(elements.length*3)/2 +1];
            System.arraycopy(elements,0,newArray,0,elements.length);
            elements = newArray;

        }
        elements[size] = t;
        size++;
        return true;
    }

    @Override
    public void remove(T t) {

    }

    @Override
    public T getElement(T t) {
        for (int i = 0; i <size ; i++) {
            if(t.equals(elements[i])){
                return (T)elements[i];

            }

        }
        return null;
    }
    public  T  get (int index){
        return (T) elements [index  ];
    }

    public int size(){
        return size;
    }
}
