package src.singleton.java.com.my.db.dao;

import java.util.ArrayList;
import java.util.List;

public abstract class AbstractDao<T, ID> implements Dao<T, ID> {
    private final List<T> dbMock = new ArrayList<>();

    @Override
    public void save(T entity) {
        dbMock.add(entity);
    }

    @Override
    public void update(T entity, ID id) {
        dbMock.set((int) id, entity);
    }

    @Override
    public void delete(ID id) {
        dbMock.remove((int) id);
    }

    @Override
    public T get(ID id) {
        return dbMock.get((int) id);
    }

    @Override
    public List<T> getAll() {
        return dbMock;
    }
}
