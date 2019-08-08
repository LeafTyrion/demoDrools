package com.example.demo.service;

import com.example.demo.domain.User;
import com.example.demo.utils.Util;
import org.springframework.stereotype.Service;

@Service
public class UserService {

    public String fireRule(){
        User user=new User();
        user.setName("张三");
        user.setAge(21);
        user.setSex("男");

        Util.fireRule(user);

        return user.getIntroduce();
    }
}
