package com.water.spring4test.ch2.profile;

public class DemoBean {
	
	private String context;
	
	public DemoBean() {
		super();
		System.out.println("调用参数的构造方法");
	}

	public DemoBean(String context) {
		super();
		this.context = context;
		System.out.println("调用带参数的构造方法,context="+context);
	}

	public String getContext() {
		return context;
	}

	public void setContext(String context) {
		this.context = context;
	}
	
}
