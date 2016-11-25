package com.water.spring4test.ch2.el;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

@Service("DDemoService2111111")
public class DDemoService2 {
	
	@Value("其他类的属性DDemoService2")
	private String another;

	public String getAnother() {
		return another;
	}

	public void setAnother(String another) {
		this.another = "qqqq";
	}
	
	
}
