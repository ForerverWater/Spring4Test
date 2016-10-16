package com.water.spring4test.ch2.prepost;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

public class JSR250WayService {
	
	@PostConstruct
	public void init(){
		System.out.println("jsr250-init-method");
	}

	public JSR250WayService() {
		super();
		System.out.println("调用JSR250WayService的构造函数");
	}
	
	@PreDestroy
	public void destroy(){
		System.out.println("jsr250-destroy-method");
	}
}
