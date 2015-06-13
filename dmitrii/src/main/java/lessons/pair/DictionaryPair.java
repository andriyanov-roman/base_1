package lessons.pair;

/**
 * Created by Programmer on 18.05.2015.
 */
public class DictionaryPair<K,V> {
    private K key;
    private V value;

    public V getValue() {
        return value;
    }

    public void setValue(V value) {
        this.value = value;
    }

    public K getKey() {
        return key;
    }

    public void setKey(K key) {
        this.key = key;
    }
}
