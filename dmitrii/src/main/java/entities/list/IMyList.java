package entities.list;

/**
 * Created by Programmer on 06.06.2015.
 */
public interface IMyList<T> {
    Boolean add (T element);
    Boolean remove (T element);
    T remove (int index);
    Boolean isEmpty();

}
