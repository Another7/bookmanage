package com.another.dao;

import java.sql.SQLException;
import java.util.List;

import com.another.domain.Book;
import com.another.domain.BorrowInfo;
import com.another.domain.Student;

/**
 * @author Another
 *  学生接口
 */
public interface StudentDao {
    /**
     * @param Student对象 注册学号
     * @return  是否注册成功
     * @throws SQLException
     */
    public boolean register(Student student) throws SQLException;
    
    /**
     * @param student 传入学生对象
     * @return  是否登录成功
     * @throws SQLException
     */
    public boolean login(Student student) throws SQLException;
    
    /**
     * @param student 学生对象
     * @return  是否更新成功
     * @throws SQLException
     */
    public boolean motifySelfInfomation(Student student) throws SQLException;
    
    /**
     * @return 图书馆图书信息列表
     * @throws SQLException
     */
    public List<Book> queryBookInfomation() throws SQLException;
    
    /**
     * @param book 要借的图书
     * @return 是否借阅成功
     * @throws SQLException
     */
    public boolean borrowBook(Book book) throws SQLException;
    
    /**
     * @param book 要还的图书
     * @return 是否归还成功
     * @throws SQLException
     */
    public boolean returnBook(Book book) throws SQLException;
    
    /**
     * @param student 学生对象
     * @return 自己借阅的图书信息列表
     * @throws SQLException
     */
    public List<BorrowInfo> queryLendedBookInfomation(Student student) throws SQLException;  
    
    /**
     * @param student 退出的学生信息
     * @return 是否退出成功
     * @throws SQLException
     */
    public boolean logout(Student student) throws SQLException;
}
