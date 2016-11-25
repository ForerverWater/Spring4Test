package com.water.spring4test.ch4.springmvc;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HelloController {
	private final static Logger logger = LoggerFactory.getLogger(HelloController.class);
	
	@RequestMapping("/index")
	public String hello(){
		logger.info("logback 成功了");
        logger.error("logback 成功了");
		return "index";
	}
}
