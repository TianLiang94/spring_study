package com.spring01.dao;

import com.spring01.entity.User;

import java.util.List;

public interface UserDAO {
    public List<User> queryUser();
    public Integer insertUser(User user);
    public Integer updateUser(User user);
    public Integer deleteUser(Integer id);

}
