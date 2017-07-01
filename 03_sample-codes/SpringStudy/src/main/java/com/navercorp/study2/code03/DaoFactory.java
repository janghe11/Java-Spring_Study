package com.navercorp.study2.code03;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.navercorp.study1.code05.dao.ConnectionMaker;
import com.navercorp.study1.code05.dao.DConnectionMaker;
import com.navercorp.study1.code05.dao.UserDao;

/**
 * 스프링 IoC(ApplicationContext)를 이용한 오브젝트 팩토리<br>
 * <br>
 * - 오브젝트를 생성하는 쪽과 사용하는 쪽의 책임과 역할을 분리<br>
 * - 오브젝트 생성 책임을 가짐<br>
 * 
 * @author hrkim
 *
 */
@Configuration
public class DaoFactory {

	/**
	 * UserDao 오브젝트를 스프링 Bean으로 제공
	 * @return
	 */
	@Bean
	public UserDao userDao() {
		UserDao userDao = new UserDao(connectionMaker());
		
		return userDao;
	}
	
	
	/**
	 * AccoutDao 오브젝트를 스프링 Bean으로 제공
	 * @return
	 */
	/*
	@Bean
	public AccountDao accountDao() {
		AccountDao accountDao = new AccountDao(connectionMaker());
		
		return accountDao;
	}
	*/
	
	
	/**
	 * 중복코드를 메소드로 분리
	 * @return
	 */
	@Bean
	public ConnectionMaker connectionMaker() {
		return new DConnectionMaker();
		//return new NConnectionMaker();
	}

}
