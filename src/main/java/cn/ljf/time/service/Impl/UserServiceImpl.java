package cn.ljf.time.service.Impl;

import cn.ljf.time.dao.UserMapper;
import cn.ljf.time.model.User;
import cn.ljf.time.service.LoginService;
import cn.ljf.time.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Set;

@Service
public class UserServiceImpl implements UserService {
    @Autowired
    private UserMapper UserMapper;
  /*    @Override
  public User getUserByEmail(String Email) {
        User userByEmail = UserMapper.selectByEmail(Email);
        return userByEmail;
    }*/

/*
    @Override
    public Set<String> getRoleByEmail(String Email) {
        return UserMapper.selectRoleByEmail(Email);
    }
*/

    @Override
    public Set<String> register(User user) {
        return UserMapper.insertUser(user);
    }

    @Override
    public List<User> getUser() {
       List<User> userInfo= UserMapper.getUser();
        return userInfo;
    }
}
