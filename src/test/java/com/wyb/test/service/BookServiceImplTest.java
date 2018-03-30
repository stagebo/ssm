package com.wyb.test.service;

import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

import com.wyb.model.Book;
import com.wyb.service.BookService;
import com.wyb.test.dao.BaseTest;

public class BookServiceImplTest extends BaseTest {

	@Autowired
	private BookService bookService;

	@Test
	public void getBookByID() throws Exception {
		long bookId = 1001;
		long studentId = 12345678910L;
		Book book = bookService.getById(bookId);
		System.out.println(book.toString());
	}

}