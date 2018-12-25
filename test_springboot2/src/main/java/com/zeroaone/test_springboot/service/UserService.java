package com.zeroaone.test_springboot.service;

import com.zeroaone.test_springboot.entities.User;

import java.util.List;

public interface UserService {

    /**
     * 根据接口查询所用的用户
     */
    public List<User> findAllUser();
}