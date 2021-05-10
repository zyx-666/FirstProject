package com.example.zyx.demo.dao;

import com.example.zyx.demo.mapper.User;


import java.util.List;


public interface UserDao{
    /**
     *查询所有操作
     */


    List<User>  selectAllUser();

    void deleteUser(Integer id);

    void insertUser(User user);

    void updateUser(User user);


 }
