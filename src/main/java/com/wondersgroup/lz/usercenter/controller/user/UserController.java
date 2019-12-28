package com.wondersgroup.lz.usercenter.controller.user;

import com.wondersgroup.lz.usercenter.domain.entity.user.User;
import com.wondersgroup.lz.usercenter.service.user.UserService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("users")
@Slf4j
public class UserController {

    @Autowired
    UserService userService;

    @GetMapping("{id}")
    public User getUserById(@PathVariable Integer id) {
        log.info("调用示例{}",id);
       return userService.getUserById(id);
    }

    @GetMapping("q")
    public User query(User user){
        return user;
    }

}
