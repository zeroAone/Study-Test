package com.zeroaone.test_springboot.service;


import com.zeroaone.test_springboot.dao.UserMapper;
import com.zeroaone.test_springboot.entities.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserServiceImpl implements UserService {

    @Autowired
    private UserMapper userMapper;
    public List<User> findAllUser() {
        List<User> list = userMapper.findAll();
        return list;
    }
}