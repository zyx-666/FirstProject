package com.example.zyx.controller;


import com.example.zyx.entity.User;
import com.example.zyx.service.UserService;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

import javax.annotation.Resource;
import java.util.List;

@RestController
public class UserController {
    @Resource
    private UserService userServiceimp;

    @RequestMapping("/selectusers")
    public List select() {
        return userServiceimp.selectusers();

    }
    @RequestMapping("/add")
    public void  add(@RequestBody User user) {
        userServiceimp.add(user);

    }
    @RequestMapping("/delete")
    public void  delete(@RequestBody int id) {
        userServiceimp.delete(id);
    }

    @RequestMapping("/update")
    public void  updata(@RequestBody User user){
        userServiceimp.update(user);
    }

    @RequestMapping(value = "/page")
    public ModelAndView home(){
        ModelAndView sel =new ModelAndView("sel");

        return sel;
    }
}
