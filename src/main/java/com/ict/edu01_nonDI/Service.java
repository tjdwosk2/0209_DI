package com.ict.edu01_nonDI;

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
	
	
	private DAO dao;
	public Service() {}
	
	public Service(DAO dao) {
		this.dao = dao;
		
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
