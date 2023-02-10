package com.ict.edu01_nonDI;

public class testmain {
	public static void main(String[] args) {
		//방법 1
//		Service service = new Service();
//		service.biz();
		
		
		//방법 2 : 생성자를 이용해서 객체 삽입 
		Service service = new Service(new OracleDAO());
		service.biz();
		System.out.println("---------------------");
		
		//방법 2 : Setter 를 이용해서 객체 삽입 
		service.setDao(new MySQLDAO());
		service.biz();
		
		
	}
}
