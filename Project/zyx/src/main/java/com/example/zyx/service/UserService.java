package com.example.zyx.service;

import com.example.zyx.entity.User;

import java.util.List;

public   interface UserService {
   List selectusers();
   void add(User user);

   void delete(int id);

   void update(User user);
}
