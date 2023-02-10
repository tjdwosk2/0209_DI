package com.ict.ex03_DI;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.GenericXmlApplicationContext;

public class TestMain_DI {
	public static void main(String[] args) {
		ApplicationContext context = 
				new GenericXmlApplicationContext("com/ict/ex03_DI/config.xml");
		MyProcess mp = (MyProcess)context.getBean("mp2");
		mp.prn();
		 
		
		
	}
}
