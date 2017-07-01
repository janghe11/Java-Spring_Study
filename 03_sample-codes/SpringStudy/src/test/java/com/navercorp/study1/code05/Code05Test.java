package com.navercorp.study1.code05;

import static org.junit.Assert.assertEquals;

import java.sql.SQLException;

import org.junit.Test;

import com.navercorp.study1.code05.dao.ConnectionMaker;
import com.navercorp.study1.code05.dao.DConnectionMaker;
import com.navercorp.study1.code05.dao.UserDao;
import com.navercorp.study1.domain.User;


public class Code05Test {

	@Test
	public void test() throws ClassNotFoundException, SQLException {
		
		/**
		 * 관심사에 따라 구현클래스를 다르게 생성한다. 
		 * 구현클래스를 생성하는 곳에서 관계 설정의 책임을 가진다.
		 */
		ConnectionMaker connectionMaker = new DConnectionMaker();
		//ConnectionMaker connectionMaker = new NConnectionMaker();
		
		
		/**
		 * 관심사에 해당하는 구현체를 주입한다.
		 * 내부에서는 데이터 엑세스 작업에만 집중한다.
		 * 
		 * (Aggregation 관계이므로 다형성 구현이 가능)
		 */
		UserDao dao = new UserDao(connectionMaker);

		
		// 조회
		User user = dao.get("1");
		System.out.println(user.getName());
		
		assertEquals("홍길동", user.getName());
	}

	
	
}
