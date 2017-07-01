package com.navercorp.study1.code04.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class SimpleConnectionMaker {

	protected Connection getConnection() throws ClassNotFoundException, SQLException {
		Class.forName("com.mysql.jdbc.Driver");
		Connection c = DriverManager.getConnection("jdbc:mysql://127.0.0.1:3307/study?autoReconnect=true&useUnicode=true&characterEncoding=utf8", "root", "root");
		return c;
	}
	
}
