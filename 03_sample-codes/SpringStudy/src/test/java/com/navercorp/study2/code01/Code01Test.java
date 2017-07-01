package com.navercorp.study2.code01;

import static org.junit.Assert.assertEquals;

import java.sql.SQLException;

import org.junit.Test;

import com.navercorp.study1.code05.dao.UserDao;
import com.navercorp.study1.domain.User;



public class Code01Test {

	@Test
	public void test() throws ClassNotFoundException, SQLException {
		
		/**
		 * 오브젝트 팩토리에서 구현클래스를 공급받는다.
		 */
		UserDao dao = new DaoFactory().userDao();

		
		// 조회
		User user = dao.get("1");
		System.out.println(user.getName());
		
		assertEquals("홍길동", user.getName());
	}

	
	
}
