package com.navercorp.study1.code04;

import static org.junit.Assert.assertEquals;

import java.sql.SQLException;

import org.junit.Test;

import com.navercorp.study1.code04.dao.UserDao;
import com.navercorp.study1.domain.User;

public class Code04Test {

	@Test
	public void test() throws ClassNotFoundException, SQLException {
		
		/**
		 * 관심사에 해당하는 구현체가 내부에서 생성된다. 
		 * 내부에서는 구현클래스 생성과 데이터 엑세스 작업에 대한 책임을 모두 가진다.
		 * 
		 * (Composition 관계이므로 다형성 구현이 불가능)
		 */
		UserDao dao = new UserDao();

		
		// 조회
		User user = dao.get("1");
		System.out.println(user.getName());
		
		assertEquals("홍길동", user.getName());
	}

	
	
}
