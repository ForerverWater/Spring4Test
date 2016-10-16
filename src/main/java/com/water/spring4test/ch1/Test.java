package com.water.spring4test.ch1;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Test {
	public static void main(String[] args) {
		AnnotationConfigApplicationContext context = 
				new AnnotationConfigApplicationContext(Ch1Config.class);
		UseFunctionService userFuncitonService = context.getBean(UseFunctionService.class);
		System.out.println(userFuncitonService.sayHello("你好"));
		context.close();
	}
}