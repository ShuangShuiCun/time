package cn.ljf.time.dao;

import cn.ljf.time.model.User;

import java.util.List;
import java.util.Set;

public interface UserMapper {
    int deleteByPrimaryKey(String userId);
    Set<String> insertUser(User user);
    int insertSelective(User record);
    User selectByEmail(String Email);
    Set<String> selectRoleByEmail(String Email);
    int updateByPrimaryKeySelective(User record);
    int updateByPrimaryKey(User record);
    List<User> getUser();
}