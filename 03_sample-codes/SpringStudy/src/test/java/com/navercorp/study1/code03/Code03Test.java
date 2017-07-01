package com.navercorp.study1.code03;

import static org.junit.Assert.assertEquals;

import java.sql.SQLException;

import org.junit.Test;

import com.navercorp.study1.code03.dao.DUserDao;
import com.navercorp.study1.code03.dao.NUserDao;
import com.navercorp.study1.code03.dao.UserDao;
import com.navercorp.study1.domain.User;

public class Code03Test {

	@Test
	public void test() throws ClassNotFoundException, SQLException {
		
		/**
		 * DB 연결을 어떻게 할 것인가라는 관심사에 따라 구현체를 교체한다.
		 */
		UserDao dao = new NUserDao();
		//UserDao dao = new DUserDao();
		
		
		// 조회
		User user = dao.get("1");
		System.out.println(user.getName());
		
		assertEquals("홍길동", user.getName());
	}

	
	
}
