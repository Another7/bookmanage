package com.another.impl;

import java.sql.SQLException;
import java.util.List;

import com.another.dao.ManagerDao;
import com.another.domain.Book;
import com.another.domain.Manager;

public class ManagerDaoImpl implements ManagerDao {

	@Override
	public boolean login(Manager manager) throws SQLException {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean insertBook(List<Book> bookList) throws SQLException {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean deleteBook(List<Book> bookList) throws SQLException {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean updateBook(Book book) throws SQLException {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public List<Book> queryBook() throws SQLException {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public boolean logout(Manager manager) throws SQLException {
		// TODO Auto-generated method stub
		return false;
	}

}
