package com.example.zyx.dao;

import com.example.zyx.entity.User;

import java.util.List;

public interface UserDao {
    List<User> selectusers();

    void add(User user);
    void update(User user);
    void delete(int id);
}
