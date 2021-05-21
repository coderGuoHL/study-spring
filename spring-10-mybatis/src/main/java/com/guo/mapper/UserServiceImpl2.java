package com.guo.mapper;

import com.guo.pojo.User;
import org.mybatis.spring.SqlSessionTemplate;
import org.mybatis.spring.support.SqlSessionDaoSupport;

import java.util.List;

public class UserServiceImpl2 extends SqlSessionDaoSupport implements UserMapper {


    public List<User> getAllUsers() {
        System.out.println("我是第二个实现类了");
       return getSqlSession().getMapper(UserMapper.class).getAllUsers();
    }
}
