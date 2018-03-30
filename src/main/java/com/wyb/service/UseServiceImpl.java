package com.wyb.service;

import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.stereotype.Service;

import com.wyb.dao.BookDao;
import com.wyb.dao.UserMapper;
import com.wyb.model.User;

@Service
public class UseServiceImpl implements UserService {
	
	@Autowired
	private UserMapper userMapper;

	public User findUserById(int id) {
		User user = userMapper.selectByPrimaryKey(id);
		return user;
	}
	
}
