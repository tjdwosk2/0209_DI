package com.ict.edu01_nonDI;

public class OracleDAO implements DAO{
	public OracleDAO() {
		System.out.println("OracleDAO 생성자");
	}
	@Override
	public void prn() {
		System.out.println("OracleDAO 메서드");
		
	}

}
