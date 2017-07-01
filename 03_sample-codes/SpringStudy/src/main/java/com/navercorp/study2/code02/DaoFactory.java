package com.navercorp.study2.code02;

import com.navercorp.study1.code05.dao.ConnectionMaker;
import com.navercorp.study1.code05.dao.DConnectionMaker;
import com.navercorp.study1.code05.dao.UserDao;

/**
 * 오브젝트 팩토리<br>
 * <br>
 * - 오브젝트를 생성하는 쪽과 사용하는 쪽의 책임과 역할을 깔끔하게 분리<br>
 * - 오브젝트 생성 책임을 가짐<br>
 * 
 * @author hrkim
 *
 */
public class DaoFactory {

	/**
	 * UserDao 오브젝트를 제공
	 * @return
	 */
	public UserDao userDao() {
		UserDao userDao = new UserDao(connectionMaker());
		
		return userDao;
	}
	
	
	/**
	 * AccoutDao 오브젝트를 제공
	 * @return
	 */
	/*
	public AccountDao accountDao() {
		AccountDao accountDao = new AccountDao(connectionMaker());
		
		return accountDao;
	}
	*/

	
	/**
	 * 중복코드를 메소드로 분리
	 * @return
	 */
	private ConnectionMaker connectionMaker() {
		return new DConnectionMaker();
		//return new NConnectionMaker();
	}
	

}
