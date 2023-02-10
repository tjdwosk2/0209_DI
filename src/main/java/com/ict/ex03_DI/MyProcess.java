package com.ict.ex03_DI;

public class MyProcess {
	private String name = "홍길동";
	private int age = 13;
	
	//기본생성자 만들어주고  
	//소스에 겟터셋터  유진필드  써주기 
	public MyProcess() {
		
	}
	// 유진필드  써주기
	public MyProcess(String name, int age) {
		super();
		this.name = name;
		this.age = age;
	}
	// 실행하고 싶은 메서드 
	public void prn() {
		System.out.println("이름 :" +name );
		System.out.println("나이 :" +age );
	}
	//private 니까 겟터 셋터만들어주자
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	
	
}
