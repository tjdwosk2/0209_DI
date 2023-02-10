package com.ict.ex03_DI;

public class TestMain {
	public static void main(String[] args) {
		//방법1
		MyProcess mp = new MyProcess("둘리", 23);
		mp.prn();
		
		//방법 2
		MyProcess mp2 = new MyProcess();
		mp2.setName("희동이");
		mp2.setAge(3);
		mp2.prn();
	}
}
