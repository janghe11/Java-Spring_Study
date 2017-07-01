package com.navercorp.study1.code02;

import static org.junit.Assert.*;

import java.sql.SQLException;

import org.junit.Test;

import com.navercorp.study1.code02.dao.UserDao;
import com.navercorp.study1.domain.User;

public class Code02Test {

	@Test
	public void test() throws ClassNotFoundException, SQLException {
		
		UserDao dao = new UserDao();
		
		// 조회
		User user = dao.get("1");
		System.out.println(user.getName());
		
		assertEquals("홍길동", user.getName());
	}

	
	
}
