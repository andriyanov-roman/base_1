package db;

import entity.Entity;

import java.util.List;

/**
 * Created by Programmer on 27.06.2015.
 */
public interface GenericDao<T extends Entity> {

    List<T> getAllEntities();
    T getEntities(int rowNo);
    void updateEntities(T entities);
    void deleteEntities(T entities);
    boolean insertEntities(T entities);

}
