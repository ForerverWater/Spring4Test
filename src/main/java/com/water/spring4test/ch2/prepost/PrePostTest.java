package com.water.spring4test.ch2.prepost;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;



public class PrePostTest {
	public static void main(String[] args) {
		AnnotationConfigApplicationContext context = 
				new AnnotationConfigApplicationContext(PrePostConfig.class);
		
		BeanWayService beanWayService = context.getBean(BeanWayService.class);
		JSR250WayService jsr250WayService = context.getBean(JSR250WayService.class);
		
		context.close();
	}
}
