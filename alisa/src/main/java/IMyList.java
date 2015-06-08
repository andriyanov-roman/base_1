/**
 * Created by User on 06.06.2015.
 */
public interface IMyList<T> {

    boolean add (T t);
    boolean add (int index, T t);
    boolean remove (T t);
    boolean remove (int index);
    T getElement (T t);
    T getElement (int index);
    int size();
}
