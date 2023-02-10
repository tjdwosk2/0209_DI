package com.ict.ex04_DI;

public class TestMain_nonDI {
	public static void main(String[] args) {
		
		Age age = new Age();
		MyProcess mp = new MyProcess("홍길동", "880808", "1", age);
		
		mp.prn();
		
		System.out.println("//////////////////////////////////");
		
		MyProcess mp2 = new MyProcess();
		mp2.setName("고은별");
		mp2.setJumin("980807");
		mp2.setGender("2");
		mp2.setAge(age);
		
		
		mp2.prn();
		
	}

}
