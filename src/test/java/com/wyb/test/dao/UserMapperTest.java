package com.wyb.test.dao;

import java.util.List;

import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

import com.wyb.dao.BookDao;
import com.wyb.dao.UserMapper;
import com.wyb.model.User;

public class UserMapperTest extends BaseTest{
	@Autowired
	private UserMapper userMapper;
	
	@Autowired
	private BookDao dao;

	@Test
	public void testQueryLike() throws Exception {
		try {
			System.out.println(dao == null);
			System.out.println(userMapper==null);
			User user = userMapper.selectByPrimaryKey(3);
			System.out.println(user.toString());
		} catch (Exception ex) {
			ex.printStackTrace();
		}
	}
}
