package sql;


import java.util.List;

public interface GenericDaoMatveu<T extends EntityMatveu> {
    void selectAllEntities();
    T getEntities(int rowNumber);
    void updateEntities(T entities);
    void deleteEntities(T entities);
    boolean insertEntities(T entities);

}
