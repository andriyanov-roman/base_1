package generics;

/**
 * Created by Programmer on 18.05.2015.
 */
public class DictionaryExample<K,V> {
    private K[] array;
    private K first;
    private V second;
    public K getFirst() {
        return first;
    }

    public void setFirst(K first) {
        this.first = first;
    }

    public V getSecond() {
        return second;
    }

    public void setSecond(V second) {
        this.second = second;
    }
}
