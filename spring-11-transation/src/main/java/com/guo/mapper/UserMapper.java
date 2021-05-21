package com.guo.mapper;

import com.guo.pojo.User;

import java.util.List;

public interface UserMapper {

    public List<User> getAllUsers();

    public int addUser(User user);

    public int updateUser(User user);

    public int deleteUser(int id);
}