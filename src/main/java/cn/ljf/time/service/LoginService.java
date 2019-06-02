package cn.ljf.time.service;

import cn.ljf.time.model.User;

import java.util.Set;

public interface LoginService {
    User getUserByEmail(String Email);
    Set<String> getRoleByEmail(String Email);
}
