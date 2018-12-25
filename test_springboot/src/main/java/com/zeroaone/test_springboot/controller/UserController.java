package com.zeroaone.test_springboot.controller;
@Controller
@ResponseBody
public class UserController {
    @Autowired
    private UserService userService;
    @RequestMapping("list")
    public List<User> list(){
        List<User> list = userService.findAllUser();
        return list;
    }
}
