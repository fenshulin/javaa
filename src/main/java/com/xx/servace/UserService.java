package com.xx.servace;

import com.xx.pojo.User;

import java.util.List;

public interface UserService {
    //注册
    int insert(User record);

    //查询账号是否重复
    boolean slelctByUserName(String username);

    //登录
    User selectByUserNameAndPassword(String username,String password);

    //通过名字查询
    List<User> selectByTname(String tname);

    //通过ID删除用户
    void delectByID(int id);
}
