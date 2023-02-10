package com.ict.edu02_DI;

public class Service {
	// 방법 1 
//	OracleDAO oracleDAO = new OracleDAO();
//	MySQLDAO mySQLDAO = new MySQLDAO();
//	
//	public void biz() {
//		
//		  oracleDAO.prn();
//		//mySQLDAO.prn();
//		
//	}
	
	// 클래스를 자료형으로 사용
	// 참조 자료형
	// DI 주입하려면 두가지 방법 생성자와,Setter
	//생성자를 이용해서 하는것
	//setter 를 쓰려면 기본생성자가 있어야 쓸수 있다 .
	
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
