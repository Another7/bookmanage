package com.another.dao;

import java.sql.SQLException;
import java.util.List;

import com.another.domain.Book;
import com.another.domain.Manager;

public interface ManagerDao {
    /**
     * @param manager 管理员对象
     * @return  是否登录成功
     * @throws SQLException
     */
    public boolean login(Manager manager) throws SQLException;
    
    /**
     * @param book 要插入的图书信息
     * @return 是否插入成功
     * @throws SQLException
     */
    public boolean insertBook(List<Book> bookList) throws SQLException;
    
    /**
     * @param bookList 要删除的图书列表
     * @return 是否删除成功
     * @throws SQLException
     */
    public boolean deleteBook(List<Book> bookList) throws SQLException;
    
    /**
     * @param book 要修改的图书
     * @return 是否修改成功
     * @throws SQLException
     */
    public boolean updateBook(Book book) throws SQLException;
    
    /**
     * @return 查询书籍的情况
     * @throws SQLException
     */
    public List<Book> queryBook() throws SQLException;
    
    /**
     * @param manager 要退出的manager
     * @return 是否退出成功
     * @throws SQLException
     */
    public boolean logout(Manager manager) throws SQLException;
}
