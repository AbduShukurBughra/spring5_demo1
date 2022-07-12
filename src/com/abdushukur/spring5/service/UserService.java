package com.abdushukur.spring5.service;

import com.abdushukur.spring5.dao.UserDao;
import com.abdushukur.spring5.dao.UserDaoImpl;

public class UserService {

    private UserDao userDao;

    public void setUserDao(UserDao userDao) {
        this.userDao = userDao;
    }

    public void add(){
        System.out.println("Service add....");
        userDao.update();

    }
}
