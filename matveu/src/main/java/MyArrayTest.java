import java.util.Objects;


public class MyArrayTest<T> implements IMyArrayList<T> {
    private int defaultCapasity=10;
    private Object[] elements;
    private int size;
    double loadFactor=0.75;


    public MyArrayTest(){
        elements=new Object[defaultCapasity];
    }

    @Override
    public boolean addToArray(T t) {
        if(!isSizeSufficient()){
            Object[] newArray=new Object[(elements.length*3)/2+1];
            System.arraycopy(elements,0,newArray,0,elements.length);
            elements=newArray;
        }
        elements[size]=t;
        size++;
        return true;
    }

    @Override
    public T getObj(T t) {
        return null;
    }

    @Override
    public boolean removeObj(Object o) {
        return false;
    }
    private boolean isSizeSufficient(){
        double arrayLoad=(double)size/elements.length;
        if(loadFactor>arrayLoad){
            return true;

        }
        return false;
    }
    private int checkCapasity(){
        return (defaultCapasity*3)/2+1;
    }
}



