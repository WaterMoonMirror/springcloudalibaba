package com.wondersgroup.lz.usercenter;

import com.wondersgroup.lz.usercenter.dao.user.UserMapper;
import com.wondersgroup.lz.usercenter.domain.entity.user.User;
import lombok.Data;
import lombok.var;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Date;

@RestController
public class TestUserController {

    @Autowired
    UserMapper userMapper;

    @GetMapping("/test")
    public User test(){
        var user=new User();
        user.setAvatarUrl("xxx");
        user.setBonus(100);
        user.setCreateTime(new Date());
        user.setUpdateTime(new Date());
        var i = userMapper.insertSelective(user);
        return user;
    }
}
