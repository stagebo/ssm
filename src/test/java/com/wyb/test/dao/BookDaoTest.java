package com.wyb.test.dao;

import java.util.List;

import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

import com.wyb.dao.BookDao;
import com.wyb.dao.UserMapper;
import com.wyb.model.Book;
import com.wyb.model.User;

public class BookDaoTest extends BaseTest {

	@Autowired
	private BookDao bookDao;
	@Autowired
	private UserMapper userMapper;

	@Test
	public void testQueryById() throws Exception {
		long bookId = 1000;
		Book book = bookDao.queryById(bookId);
		System.out.println(book);
	}

	@Test
	public void testQueryAll() throws Exception {

		List<Book> books = bookDao.queryAll(0, 4);
		for (Book book : books) {
			System.out.println(book.toString());
		}
	}

	@Test
	public void testQueryByID() {
		try {
			System.out.println(userMapper == null);
			User user = userMapper.selectByPrimaryKey(3);
			System.out.println(user.toString());
		} catch (Exception ex) {
			ex.printStackTrace();
		}
	}
	/*
	 * @Test public void testReduceNumber() throws Exception { long bookId =
	 * 1000; int update = bookDao.reduceNumber(bookId);
	 * System.out.println("update=" + update); }
	 */

	/*
	 * @Test public void testQueryLike() throws Exception { String name = "设计";
	 * try {
	 * 
	 * List<Book> list = bookDao.queryListLikeName(name);
	 * 
	 * System.out.println("aaaaaaaaaaaaaa" + list.size()); for (Book book :
	 * list) { System.out.println(book); } } catch (Exception ex) {
	 * ex.printStackTrace(); } }
	 */

}