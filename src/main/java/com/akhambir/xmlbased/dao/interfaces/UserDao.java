package com.akhambir.xmlbased.dao.interfaces;

import com.akhambir.xmlbased.model.User;

public interface UserDao extends GenericDao<User> {
    User addUser(User user);
}
