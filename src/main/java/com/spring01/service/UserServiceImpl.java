package com.spring01.service;

import com.spring01.dao.UserDAO;
import com.spring01.dao.UserDaoImpl;
import com.spring01.entity.User;
import org.springframework.beans.factory.annotation.Autowired;

public class UserServiceImpl implements UserService{


    //强耦合
    //private UserDAO userDao = new UserDaoImpl();
    @Autowired
    private UserDaoImpl userDAO;

    @Override
    public User queryUser() {
        return userDAO.queryUser();
    }


    public void setUserDao(UserDaoImpl userDao) {
        this.userDAO = userDao;
    }
}
