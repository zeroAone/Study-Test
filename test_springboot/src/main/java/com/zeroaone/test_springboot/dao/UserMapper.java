package com.zeroaone.test_springboot.dao;



import java.util.List;
import org.apache.ibatis.annotations.Mapper;

import cn.qlq.bean.User;

@Mapper
public interface UserMapper {

    public List<User> findAll();

}