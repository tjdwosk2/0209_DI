package com.ict.ex05_Anotation;

import org.springframework.stereotype.Component;


@Component
public class MySQLDAO implements DAO{
	public MySQLDAO() {
		System.out.println("MySQLDAO 생성자");
	}
	@Override
	public void prn() {
		System.out.println("MySQLDAO 메소드");	
	}

}
