package com.navercorp.study1.code01;

import static org.junit.Assert.assertEquals;

import java.sql.SQLException;

import org.junit.Test;

import com.navercorp.study1.code01.dao.UserDao;
import com.navercorp.study1.domain.User;

public class Code01Test {

	@Test
	public void test() throws ClassNotFoundException, SQLException {
		
		UserDao dao = new UserDao();
		
		User user = new User();
		user.setId("1");
		user.setName("홍길동");
		user.setPassword("1234");
		
		// 추가
		//dao.add(user);
		
		// 조회
		User user2 = dao.get(user.getId());
		System.out.println(user2.getName());
		
		assertEquals("홍길동", user.getName());
	}

	
	
}
