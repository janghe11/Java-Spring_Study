package com.navercorp.study2.code03;

import static org.junit.Assert.assertEquals;

import java.sql.SQLException;

import org.junit.Test;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.navercorp.study1.code05.dao.UserDao;
import com.navercorp.study1.domain.User;



public class Code03Test {

	@Test
	public void test() throws ClassNotFoundException, SQLException {
		
		/**
		 * 컨테이너 생성시 오브젝트 팩토리에 정의된 모든 Bean을 읽어들인다.
		 */
		@SuppressWarnings("resource")
		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(DaoFactory.class);
		
		
		/**
		 * ApplicationContext에서 Bean을 공급받는다.
		 */
		UserDao dao = context.getBean("userDao", UserDao.class);
		//UserDao dao = context.getBean("accountDao", AccountDao.class);

		
		// 조회
		User user = dao.get("1");
		System.out.println(user.getName());
		
		assertEquals("홍길동", user.getName());
	}

	
	
}
