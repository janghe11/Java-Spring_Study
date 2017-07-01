package com.navercorp.study1.code04.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import com.navercorp.study1.domain.User;

/**
 * 관심사의 분리 (구현1)
 * 
 * @author hrkim
 *
 */
public class UserDao {

	/**
	 * 클래스 생성시 구현클래스를 생성한다. (new)
	 */
	private SimpleConnectionMaker simpleConnectionMaker;
	
	public UserDao() {
		// 구현체가 코드에 고정되어 있다. (Composition)
		this.simpleConnectionMaker = new SimpleConnectionMaker();
	}
	
	
	
	public void add(User user) throws ClassNotFoundException, SQLException {
		
		// 구현클래스에서 커넥션 정보를 구한다.
		Connection c = simpleConnectionMaker.getConnection();

		PreparedStatement ps = c.prepareStatement("insert into users(id, name, password) values(?,?,?)");
		ps.setString(1, user.getId());
		ps.setString(2, user.getName());
		ps.setString(3, user.getPassword());

		ps.executeUpdate();

		ps.close();
		c.close();
	}


	
	public User get(String id) throws ClassNotFoundException, SQLException {
		
		// 구현클래스에서 커넥션 정보를 구한다.
		Connection c = simpleConnectionMaker.getConnection();
		
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
	

}
