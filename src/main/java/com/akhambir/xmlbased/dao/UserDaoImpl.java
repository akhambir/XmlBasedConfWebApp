package com.akhambir.xmlbased.dao;

import com.akhambir.xmlbased.dao.interfaces.UserDao;
import com.akhambir.xmlbased.model.User;
import org.hibernate.SessionFactory;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

@Repository
@Transactional
public class UserDaoImpl extends AbstractDao<User> implements UserDao {

    public UserDaoImpl(SessionFactory sessionFactory) {
        super(sessionFactory);
    }

    @Override
    public User addUser(User user) {
        return add(user);
    }
}
