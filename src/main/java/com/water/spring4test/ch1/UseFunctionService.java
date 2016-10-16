package com.water.spring4test.ch1;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UseFunctionService {
	@Autowired
	FunctionService functionService;
	
	public String sayHello(String word){
		return functionService.sysHello(word);
	}
	
}