package cn.ljf.time.service;

import cn.ljf.time.model.User;

import java.util.List;
import java.util.Set;

public interface UserService {
    Set<String> register(User user);
    public List<User> getUser();
}
