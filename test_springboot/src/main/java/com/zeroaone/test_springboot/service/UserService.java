package com.zeroaone.test_springboot.service;

public interface UserService {

    /**
     * 根据接口查询所用的用户
     */
    public List<User> findAllUser();
}