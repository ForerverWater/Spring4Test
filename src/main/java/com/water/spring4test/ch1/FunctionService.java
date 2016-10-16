package com.water.spring4test.ch1;

import org.springframework.stereotype.Service;

@Service
public class FunctionService {
	public String sysHello(String word){
		return "Hello" + word + "!";
	}
}