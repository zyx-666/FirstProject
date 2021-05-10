package com.example.zyx.demo.controller;

import com.example.zyx.demo.dao.UserDao;
import com.example.zyx.demo.mapper.User;
import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.web.bind.annotation.RequestMapping;

import org.springframework.web.bind.annotation.RestController;



@RestController

public class UserController {

    @Autowired
    private UserDao userDao;

    @RequestMapping("select")
    public void userselect(){

        System.out.println(userDao.selectAllUser());
    }
    @RequestMapping("delete")
    public void userdelete(){
        userDao.deleteUser(1);
        System.out.println("已删除");
    }
    @RequestMapping("insert")
    public void userinsert(){
        User user=new User();
        user.setId(7);
        user.setName("丽丽");
        user.setSex("女");

        userDao.insertUser(user);
        System.out.println("已插入");
    }
    @RequestMapping("update")
    public void userupdate(){
        User user=new User();
        user.setId(7);
        user.setName("波波");
        user.setSex("男");
        userDao.updateUser(user);
        System.out.println("已更新");
    }
}
