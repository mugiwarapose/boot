package com.ft.conntroller;

import com.ft.entity.User;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by poseture on 2017/2/3.
 */
@RestController
public class HelloController {

    @RequestMapping("/index")
    public String index(){
        return "welcome";
    }


    @RequestMapping("/user")
    public User getUser(){
        User user = new User();

        user.setUserId("ab0101001");
        user.setUserNum(10101L);

        user.setUsername("luffy");

        user.setPassword("1234");

        return user;
    }
}
