package com.example.demo.controller;

import com.example.demo.service.UserService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@ResponseBody
@Controller
public class UserContorller {

    @RequestMapping("AddUser")
    public void AddUser() {
        UserService hello =  new UserService();
        String a =hello.sayhello();
        System.out.println(a);

}
}
