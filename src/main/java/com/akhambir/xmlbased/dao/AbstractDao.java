package com.akhambir.xmlbased.dao;

import com.akhambir.xmlbased.dao.interfaces.GenericDao;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class AbstractDao<T> implements GenericDao<T> {

    protected final SessionFactory sessionFactory;

    @Autowired
    public AbstractDao(SessionFactory sessionFactory) {
        this.sessionFactory = sessionFactory;
    }

    @Override
    public T add(T entity) {
        Session session = sessionFactory.getCurrentSession();
        session.save(entity);
        session.flush();
        return entity;
    }

    @Override
    public T remove(Integer id) {
        // TODO impl needed
        return null;
    }

    @Override
    public T update(T entity) {
        Session session = sessionFactory.getCurrentSession();
        session.update(entity);
        session.flush();
        return entity;
    }

    @Override
    public T getById(T entity, Integer id) {   //TODO maybe it is real sh.t?
        Session session = sessionFactory.getCurrentSession();
        session.get(entity.getClass(), id);
        session.flush();
        return entity;
    }

    @Override
    public List<T> getAll() {
        // TODO impl needed
        return null;
    }
}
