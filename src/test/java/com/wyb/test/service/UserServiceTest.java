package com.wyb.test.service;

import java.util.List;

import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

import com.wyb.dao.BookDao;
import com.wyb.dao.UserMapper;
import com.wyb.model.User;
import com.wyb.service.UserService;
import com.wyb.test.dao.BaseTest;

public class UserServiceTest extends BaseTest{
	@Autowired
	private UserService service;


	@Test
	public void testQueryLike() throws Exception {
		User user = service.findUserById(1);
		System.out.println(user.toString());
	}
}
