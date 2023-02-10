package com.ict.edu01_nonDI;

//DAO 를 상속받자
public class MySQLDAO implements DAO{
	public MySQLDAO() {
		System.out.println("MySQLDAO 생성자");
	}
	
	//미리만들어저있는거 오버로딩을하자 
	@Override
	public void prn() {
		System.out.println("MySQLDAO 메소드");	
	}

}
