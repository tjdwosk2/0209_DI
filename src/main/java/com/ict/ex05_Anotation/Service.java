package com.ict.ex05_Anotation;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component("ser")
public class Service {
	//클래스를 자료형으로 사용
	//같은 이름이 없을 때  참조클래스의 아이디를 입력한다
	//@Qualifier("mySQLDAO")
		
	//변수이름과 참조하는 클래스의 id 같을 때 사용  (DAO dao ) 이름이같다
	@Autowired
	//지정
	@Qualifier("mySQLDAO")
	private DAO dao;
	public Service() {}
	
	public Service(DAO dao) {
		this.dao = dao;
		System.out.println("Service 생성자");
		
	//setter 으로 하는것 
	}
	public DAO getDao() {
		return dao;
	}
	public void setDao(DAO dao) {
		this.dao = dao;
	}
	public void biz() {
		dao.prn();
	}
	
	
}
