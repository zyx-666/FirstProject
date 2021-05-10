package com.example.zyx.service.impl;

import com.example.zyx.dao.UserDao;
import com.example.zyx.entity.User;
import com.example.zyx.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service("userServiceimp")
public class UserServieImp  implements UserService {
    @Autowired
    UserDao userDao;
    public  List selectusers(){
       return userDao.selectusers();

    }
    @Override
    public void add(User user) {
        userDao.add(user);
    }

    public void delete(int id){
        userDao.delete(id);
    }

    public void update(User user) {
        userDao.update(user);
    }

}
