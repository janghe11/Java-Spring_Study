package com.navercorp.study1.code03.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import com.navercorp.study1.domain.User;

/**
 * 관심사의 분리 (상속)
 * 
 * @author hrkim
 *
 */
public abstract class UserDao {
	
	public void add(User user) throws ClassNotFoundException, SQLException {
		
		// 상속관계의 구현체에서 커넥션 정보를 구한다.
		Connection c = getConnection();

		PreparedStatement ps = c.prepareStatement("insert into users(id, name, password) values(?,?,?)");
		ps.setString(1, user.getId());
		ps.setString(2, user.getName());
		ps.setString(3, user.getPassword());

		ps.executeUpdate();

		ps.close();
		c.close();
	}


	public User get(String id) throws ClassNotFoundException, SQLException {
		
		// 상속관계의 구현체에서 커넥션 정보를 구한다.
		Connection c = getConnection();
		
		PreparedStatement ps = c.prepareStatement("select * from users where id = ?");
		ps.setString(1, id);

		ResultSet rs = ps.executeQuery();
		rs.next();
		User user = new User();
		user.setId(rs.getString("id"));
		user.setName(rs.getString("name"));
		user.setPassword(rs.getString("password"));

		rs.close();
		ps.close();
		c.close();

		return user;
	}
	
	
	/**
	 * 구현 클래스에서 구현해야 하는 추상메소드
	 * @return
	 * @throws ClassNotFoundException
	 * @throws SQLException
	 */
	abstract protected Connection getConnection() throws ClassNotFoundException, SQLException;

}
