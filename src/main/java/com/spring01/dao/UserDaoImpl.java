package com.spring01.dao;

import com.spring01.entity.User;

import java.util.List;

public class UserDaoImpl implements UserDAO {

    @Override
    public List<User> queryUser() {
        User user = new User();

        //return user;
        return null;
    }

    @Override
    public Integer insertUser(User user) {
        return null;
    }

    @Override
    public Integer updateUser(User user) {
        return null;
    }

    @Override
    public Integer deleteUser(Integer id) {
        return null;
    }

}
