package com.water.spring4test.ch2.profile;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class ProfileTest {
	public static void main(String[] args) {
		AnnotationConfigApplicationContext context = 
				new AnnotationConfigApplicationContext();
		
		context.getEnvironment().setActiveProfiles("dev");//改为prod则调用prod的方法
		context.register(ProfileConfig.class);
		context.refresh();
		
		DemoBean demoBean = context.getBean(DemoBean.class);
		System.out.println(demoBean.getContext());
		context.close();
	}
}
