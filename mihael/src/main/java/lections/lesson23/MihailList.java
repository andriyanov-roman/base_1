package lections.lesson23;

/**
 * Created by Programmer on 06.06.2015.
 */
public interface MihailList <T>
{
    public void add(T o);
    public  T get(int index);
    public boolean  remove(T o);
    public boolean  remove(int index);
}
