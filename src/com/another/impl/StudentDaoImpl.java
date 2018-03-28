package com.another.impl;

import java.sql.SQLException;
import java.util.List;

import com.another.dao.StudentDao;
import com.another.domain.Book;
import com.another.domain.BorrowInfo;
import com.another.domain.Student;

public class StudentDaoImpl implements StudentDao{

	@Override
	public boolean register(String studentid) throws SQLException {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean login(Student student) throws SQLException {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean motifySelfInfomation(Student student) throws SQLException {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public List<Book> queryBookInfomation() throws SQLException {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public boolean borrowBook(Book book) throws SQLException {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean returnBook(Book book) throws SQLException {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public List<BorrowInfo> queryLendedBookInfomation(Student student) throws SQLException {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public boolean logout(Student student) throws SQLException {
		// TODO Auto-generated method stub
		return false;
	}

}
