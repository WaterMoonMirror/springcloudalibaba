package com.wondersgroup.lz.usercenter;

import com.wondersgroup.lz.usercenter.dao.user.UserMapper;
import com.wondersgroup.lz.usercenter.domain.entity.user.User;
import lombok.RequiredArgsConstructor;
import lombok.val;
import lombok.var;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.client.ServiceInstance;
import org.springframework.cloud.client.discovery.DiscoveryClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Date;
import java.util.List;

@RestController
@RequiredArgsConstructor(onConstructor = @__(@Autowired))
public class TestUserController {

 final    UserMapper userMapper;
final DiscoveryClient discoveryClient;
    @GetMapping("/test")
    public User test(){
        val user=new User();
        user.setAvatarUrl("xxx");
        user.setBonus(100);
        user.setCreateTime(new Date());
        user.setUpdateTime(new Date());
        var i = userMapper.insertSelective(user);
        return user;
    }

    @GetMapping("test2")
    public List<ServiceInstance> test2(){
        var instances = discoveryClient.getInstances("user-centos");
        return instances;
    }



}
