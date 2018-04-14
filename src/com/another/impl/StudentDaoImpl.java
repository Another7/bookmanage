package com.another.impl;

import java.sql.SQLException;
import java.util.List;

import org.apache.commons.dbutils.QueryRunner;
import org.apache.commons.dbutils.handlers.ArrayHandler;
import org.apache.commons.dbutils.handlers.ArrayListHandler;
import org.apache.commons.dbutils.handlers.BeanListHandler;

import com.another.dao.StudentDao;
import com.another.domain.Book;
import com.another.domain.BorrowInfo;
import com.another.domain.Student;
import com.another.util.DBCPUtil;

public class StudentDaoImpl implements StudentDao {

	@Override
	public boolean register(Student student) throws SQLException {
		// TODO Auto-generated method stub
		String sql  = " INSERT IGNORE INTO student (id, name, password) values (?, ?, ?) ";
		QueryRunner queryRunner = new QueryRunner(DBCPUtil.getDataSource());
		Object[] params = {student.getId(), student.getName(), student.getPassword()};
		int flag = queryRunner.update(sql, params);
		if (flag == 1) {
			return true;
		}
		return false;
	}

	@Override
	public boolean login(Student student) throws SQLException {
		// TODO Auto-generated method stub
		QueryRunner queryRunner = new QueryRunner(DBCPUtil.getDataSource());
		String sql = " SELECT * FROM student WHERE id = ? and password = ? ";
		Object[] params = {student.getId(), student.getPassword()};
		Object[] result = queryRunner.query(sql, new ArrayHandler(),params);
		if (result != null && result.length != 0) {
			return true;
		}
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
		List<BorrowInfo> borrowInfoList = null;
		QueryRunner queryRunner = new QueryRunner();
		String sql = "SELECT * FROM borrowinfo WHERE studentid = ?";
		Object[] params = {student.getId()};
		borrowInfoList = (List<BorrowInfo>) queryRunner.query(DBCPUtil.getConnection(), sql, new BeanListHandler(BorrowInfo.class), params);
//		System.out.println(borrowInfoList.get(0).isBack());
//		System.out.println(borrowInfoList.get(0).toString()); 
		return borrowInfoList;
	}

	@Override
	public boolean logout(Student student) throws SQLException {
		// TODO Auto-generated method stub
		return false;
	}

}
