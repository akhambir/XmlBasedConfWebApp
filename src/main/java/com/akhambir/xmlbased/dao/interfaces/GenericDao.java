package com.akhambir.xmlbased.dao.interfaces;

import java.util.List;

public interface GenericDao<T> {
    T add(T entity);
    T remove(Integer id);
    T update(T entity);
    T getById(T entity, Integer id);
    List<T> getAll();
}
