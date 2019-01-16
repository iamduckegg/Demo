package com.zx.mapper;

import java.util.List;

import org.springframework.stereotype.Repository;

import com.zx.entity.User;

@Repository
public interface UserMapper {
	//查询用户表
	public List<User> userList();
}
