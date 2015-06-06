/**
 * Created by User on 06.06.2015.
 */
public interface IMyList<T> {

    boolean add (T t);
    void remove (T t);
    T getElement (T t);
}
