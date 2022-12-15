package src.proxy.java.com.my.repository;

public interface Repository<T, ID> {
    T get(ID id);
}
