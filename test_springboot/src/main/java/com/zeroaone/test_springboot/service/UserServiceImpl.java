package com.zeroaone.test_springboot.service;

@Service
public class UserServiceImpl implements UserService {

    @Autowired
    private UserMapper userMapper;
    public List<User> findAllUser() {
        List<User> list = userMapper.findAll();
        return list;
    }
}