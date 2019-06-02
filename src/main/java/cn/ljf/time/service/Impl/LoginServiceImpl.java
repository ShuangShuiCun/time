package cn.ljf.time.service.Impl;

import cn.ljf.time.dao.UserMapper;
import cn.ljf.time.model.User;
import cn.ljf.time.service.LoginService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Set;


public class LoginServiceImpl implements LoginService {
    @Autowired
    private UserMapper UserMapper;
    @Override
    public User getUserByEmail(String Email) {
        User userByEmail = UserMapper.selectByEmail(Email);
        return userByEmail;
    }

    @Override
    public Set<String> getRoleByEmail(String Email) {
        return UserMapper.selectRoleByEmail(Email);
    }
}
