package com.akhambir.xmlbased.services;

import com.akhambir.xmlbased.dao.interfaces.UserDao;
import com.akhambir.xmlbased.model.User;
import com.akhambir.xmlbased.services.interfaces.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImpl implements UserService {

    private final UserDao userDao;

    @Autowired
    public UserServiceImpl(UserDao userDao) {
        this.userDao = userDao;
    }

    @Override
    public User addUser(User user) {
        return userDao.addUser(user);
    }
}
