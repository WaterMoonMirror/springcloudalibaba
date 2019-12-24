package com.wondersgroup.lz.usercenter.controller.user;

import com.wondersgroup.lz.usercenter.domain.entity.user.User;
import com.wondersgroup.lz.usercenter.service.user.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("users")
public class UserController {

    @Autowired
    UserService userService;

    @GetMapping("{id}")
    public User getUserById(@PathVariable Integer id) {
       return userService.getUserById(id);
    }

}
