package com.xx.servace;

import java.util.List;

import org.apache.ibatis.session.SqlSession;

import com.xx.mapper.UserMapper;
import com.xx.pojo.User;
import com.xx.util.MybatisUtil;

public class UserServiceImpl implements UserService{

	@Override
	public int insert(User record) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public boolean slelctByUserName(String username) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public User selectByUserNameAndPassword(String username, String password) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<User> selectByTname(String tname) {
		SqlSession ss=new MybatisUtil().getSqlsession();
		UserMapper mapper = ss.getMapper(UserMapper.class);
		List<User> users = mapper.selectByTname(tname);
		return users;
	}

	@Override
	public void delectByID(int id) {
		// TODO Auto-generated method stub
		
	}
	
}
