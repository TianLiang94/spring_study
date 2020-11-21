package com.spring01.dao;

import com.spring01.entity.User;

public class UserDaoImpl implements UserDAO{

        @Override
        public User queryUser() {
            User user = new User();
            user.setId(1);
            user.setPassword("333464");
            user.setSex("男");
            return user;
        }

}
