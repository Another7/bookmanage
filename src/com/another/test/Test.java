package com.another.test;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class Test {

	public static void main(String[] args) throws SQLException {
		// TODO Auto-generated method stub
		String sql = "select isBack from borrowinfo ";
		Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/bookinfo", "root", "123456");
		PreparedStatement ps = conn.prepareStatement(sql);
		ResultSet rs = ps.executeQuery();
		while (rs.next()) {
			System.out.println(rs.getBoolean("isBack"));
		}
	}

}
