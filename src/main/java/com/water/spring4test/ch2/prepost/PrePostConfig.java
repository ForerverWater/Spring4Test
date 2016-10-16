package com.water.spring4test.ch2.prepost;

import org.springframework.context.annotation.Bean;

/**
 * Bean的初始化与销毁
 * @author PC
 *
 */
public class PrePostConfig {
	
	@Bean(initMethod="init",destroyMethod="destroy")
	public BeanWayService beanWayService(){
		return new BeanWayService();
	}
	
	@Bean
	public JSR250WayService jsr250WayService(){
		return new JSR250WayService();
	}
}
