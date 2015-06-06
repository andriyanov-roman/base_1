package entities.list;

/**
 * Created by Programmer on 06.06.2015.
 */
public class DiamondList<T> implements IMyList {
    private Object[] elements;
    private int size = 0;
    private Double loadFactor;

    @Override
    public Boolean add(Object o) {
        if (!isSizeSufficent()){
            Object[] arrayOne = new Object[10];
            Object[] newArray = new Object[(elements.length*3)/2+1];
            System.arraycopy(arrayOne,0,newArray,0,arrayOne.length);
            elements = newArray;

        }
        return null;
    }

    private boolean isSizeSufficent() {
        return false;
    }

    @Override
    public Boolean remove(Object o) {
        return null;
    }
    private void resizeMyList (){
        //if (loadFactor>=defaultCapacity)
    }
    private int checkCapacity(){
        return 0;
    }
}
