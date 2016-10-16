package com.water.spring4test.ch2.prepost;

public class BeanWayService {
	
	public void init(){
		System.out.println("使用@Bean-init-method");
	}

	public BeanWayService() {
		super();
		System.out.println("调用BeanWayService的构造函数");
	}
	
	public void destroy(){
		System.out.println("使用@Bean-destroy-method");
	}
	
}
