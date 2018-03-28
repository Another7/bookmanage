package com.another.test;

import java.sql.Connection;
import java.sql.SQLException;

import com.another.util.TomcatDBUtil;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        try {
			Connection connection = null;
			connection = TomcatDBUtil.getConnection();
			if (connection == null){
				System.out.println("连接失败");
			} else {
				System.out.println("连接成功");
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
        
	}

}
