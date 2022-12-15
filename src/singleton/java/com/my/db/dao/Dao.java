package src.singleton.java.com.my.db.dao;

import java.util.List;

public interface Dao<T, ID> {
    void save(T entity);
    void update(T entity, ID id);
    void delete(ID id);
    T get(ID id);
    List<T> getAll();
}
