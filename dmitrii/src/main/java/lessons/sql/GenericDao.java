package lessons.sql;

import java.util.List;

/**
 * Created by Programmer on 27.06.2015.
 */
public interface GenericDao<T extends Entity> {
    List<T> getEntities();
    T getEntity();
    void update(T t);
    void deleteEntity(T t);
    void insert(T t);
}
