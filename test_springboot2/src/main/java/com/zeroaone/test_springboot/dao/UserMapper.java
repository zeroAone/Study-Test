package com.zeroaone.test_springboot.dao;


import com.zeroaone.test_springboot.entities.User;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface UserMapper {

    public List<User> findAll();

}