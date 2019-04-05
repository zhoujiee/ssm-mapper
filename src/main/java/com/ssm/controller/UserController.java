package com.ssm.controller;

import com.ssm.mapper.UserMapper;
import com.ssm.pojo.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import tk.mybatis.mapper.entity.Example;

import java.util.List;

/**
 * @description:
 * @author: ZJ
 * @date: 2019/4/5
 */
@RestController
@RequestMapping("/user")
public class UserController {

    @Autowired(required = false)
    UserMapper userMapper;

    @GetMapping("/list")
    public List<User> getUserMapper() {
        return userMapper.selectAll();
    }

    @GetMapping("/find")
    public List<User> find() {
        Example userExample = new Example(User.class);
        userExample.createCriteria().andEqualTo("id", "2");
        return userMapper.selectByExample(userExample);
    }
}
