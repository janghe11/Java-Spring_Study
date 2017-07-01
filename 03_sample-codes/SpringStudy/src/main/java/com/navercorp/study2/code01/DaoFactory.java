package com.navercorp.study2.code01;

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
		
		/**
		 * 관심사에 따라 구현클래스를 생성한다. 
		 * 관계 설정의 책임을 가진다.
		 */
		ConnectionMaker connectionMaker = new DConnectionMaker();
		//ConnectionMaker connectionMaker = new NConnectionMaker();
		
		
		/**
		 * 관심사에 해당하는 구현체를 주입한다. (다형성 구현)
		 * 데이터 엑세스 작업에 대한 책임을 가진다.
		 */
		UserDao userDao = new UserDao(connectionMaker);
		
		
		return userDao;
	}
	
}
