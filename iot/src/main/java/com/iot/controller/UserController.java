package com.iot.controller;


import com.iot.common.Result;
import com.iot.entity.User;
import com.iot.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * <p>
 *  前端控制器
 * </p>
 *
 * @author wjc
 * @since 2023-03-21
 */
@RestController
@RequestMapping("/user")
public class UserController {
    @Autowired
    private UserService userService;

    @GetMapping("/list")
    public Result list(){
        List<User> result = userService.list();
        return Result.suc(result);
    }

    @PostMapping("/login")
    public Result login(@RequestBody User user){
        List list = userService.lambdaQuery()
                .eq(User::getNo,user.getNo())
                .eq(User::getPassword,user.getPassword()).list();
        return list.size()>0? Result.suc(list.get(0)) : Result.fail();
    }

}
