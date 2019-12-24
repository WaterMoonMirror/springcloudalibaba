package com.wondersgroup.lz.usercenter.service.user;

import com.wondersgroup.lz.usercenter.dao.user.UserMapper;
import com.wondersgroup.lz.usercenter.domain.entity.user.User;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor(onConstructor = @__(@Autowired))
public class UserService {
    final UserMapper userMapper;
    public User getUserById(Integer id){
        return userMapper.selectByPrimaryKey(id);
    }
}
