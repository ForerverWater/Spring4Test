package com.water.spring4test.ch1;

import org.springframework.context.annotation.Configuration;

@Configuration
public class JavaConfig {
	
	public FunctionService functionService(){
		return new FunctionService();
	}
	
//	public UseFunctionService userFunctionService(){
//		UseFunctionService userFunctionService = new UseFunctionService();
//		userFunctionService.s
//	}
	
	
}
