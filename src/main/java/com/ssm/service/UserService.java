package com.ssm.service;

import com.ssm.pojo.User;

import java.util.List;

/**
 * @description: 用户服务资源
 * @author: ZJ
 * @date: 2019/4/5
 */
public interface UserService {
    List<User> findAll();
}
