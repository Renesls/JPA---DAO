package services.interfaces;

import java.util.List;

public interface ICRUD<T> {
    <E> List<E> getAll(String nameQuery, Class<E> clazz);
    <E> void insert(E entity);
    <E> void update(E entity);
    <E> void delete(E entity);
    <E> E findById(Integer id, Class<E> clazz);
}
