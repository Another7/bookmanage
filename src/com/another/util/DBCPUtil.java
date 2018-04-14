package com.another.util;

import java.io.FileInputStream;
import java.io.IOException;
import java.sql.Connection;
import java.sql.SQLException;
import java.util.Properties;

import javax.sql.DataSource;

import org.apache.commons.dbcp2.BasicDataSourceFactory;

public class DBCPUtil {
//    private static String name;
//    private static String password;
//    private static String url;
//    private static String driverName;
    private static DataSource dataSource;
    
    static{
    	Properties property = new Properties();
    	try {
    			
			property.load(DBCPUtil.class.getClassLoader().getResourceAsStream("dbcpconfig.properties"));
			dataSource = BasicDataSourceFactory.createDataSource(property);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
    }
    
    public static Connection getConnection() throws SQLException{
    	return dataSource.getConnection();
    }
    
    public static DataSource getDataSource() throws SQLException{
    	return dataSource;
    }
}
