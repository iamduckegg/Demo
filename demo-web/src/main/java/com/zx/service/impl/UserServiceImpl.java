package com.zx.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.zx.entity.User;
import com.zx.mapper.UserMapper;
import com.zx.service.UserService;
@Service
public class UserServiceImpl implements UserService {
	
	@Autowired
	private UserMapper userMapper;
	
	@Override
	public List<User> queryUserList() {
		
		return userMapper.userList();
	}
	
}
