package com.guo.mapper;

import com.guo.pojo.User;
import org.mybatis.spring.SqlSessionTemplate;

import java.util.List;

public class UserServiceImpl implements UserMapper {
    //我们的所有操作都是用sqlSession来执行，现在使用SqlSessionTemplate
    private SqlSessionTemplate sqlSession;

    public void setSqlSession(SqlSessionTemplate sqlSession) {
        this.sqlSession = sqlSession;
    }

    public List<User> getAllUsers() {
        return sqlSession.getMapper(UserMapper.class).getAllUsers();
    }
}
