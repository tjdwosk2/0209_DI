package com.ict.ex05_Anotation;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.GenericXmlApplicationContext;

public class testmain {
	public static void main(String[] args) {
		//DI 는 Spring Container 에서 객체 생성 (Bean) 생성하고 관리한다.
		// Spring Container 에게 필요한 정보를 제공하는 설정 정보 파일을 만들자
		
		//cofig.xml 호출할 수 있는 클래스 
		// Spring Container => BeanFactory =>ApplicationContext
		//								   => WebApplicationContext (web)
		
		ApplicationContext context = new GenericXmlApplicationContext("com/ict/ex05_Anotation/config.xml");

		    Service service = (Service)context.getBean("ser");
			    
		    service.biz();
		    
		    
	}
}
