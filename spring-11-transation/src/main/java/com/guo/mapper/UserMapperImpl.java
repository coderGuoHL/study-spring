package com.guo.mapper;

import com.guo.pojo.User;
import org.mybatis.spring.support.SqlSessionDaoSupport;

import java.util.List;

public class UserMapperImpl extends SqlSessionDaoSupport implements UserMapper {
    public List<User> getAllUsers() {
        User user = new User(100, "Coder guo", "123");
        addUser(user);
        deleteUser(user.getId());
        return getSqlSession().getMapper(UserMapper.class).getAllUsers();
    }

    public int addUser(User user) {
        return getSqlSession().getMapper(UserMapper.class).addUser(user);
    }

    public int updateUser(User user) {
        return getSqlSession().getMapper(UserMapper.class).updateUser(user);

    }

    public int deleteUser(int id) {
        return getSqlSession().getMapper(UserMapper.class).deleteUser(id);
    }
}
