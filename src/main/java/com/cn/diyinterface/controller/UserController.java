package com.cn.diyinterface.controller;


import com.cn.diyinterface.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import com.cn.diyinterface.pojo.User;
import java.util.List;

/**
 * @author
 * @date
 * @email
 */
@RestController
public class UserController {

    @Autowired
    private UserService userService;

    @GetMapping("/list")
    public List<User> findAll() {
        return userService.findAll();
    }
}
