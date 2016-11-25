package com.water.spring4test.ch2.el;

import java.io.IOException;

import org.apache.commons.io.IOUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;
import org.springframework.context.support.PropertySourcesPlaceholderConfigurer;
import org.springframework.core.env.Environment;
import org.springframework.core.io.Resource;


/**
 * spring El与资源调用
 * @author PC
 *
 */
@Configuration
@ComponentScan("com.water.spring4test.ch2.el")
@PropertySource("classpath:com/water/spring4test/ch2/el/test.txt")
public class ElConfig {

	@Value("normal")
	private String normal;

	@Value("#{systemProperties['os.name']}")
	private String osName;

	@Value("#{T(java.lang.Math).random() * 100.0 }")
	private double randomNumber;

	@Value("#{DDemoService2111111.another}")
	private String fromAnother;

	@Value("classpath:com/water/spring4test/ch2/el/test.txt")
	private Resource testFile;

	@Value("http://www.baidu.com")
	private Resource testUrl;

	@Value("${book.name}")
	private String bookName;

	@Autowired
	private Environment environment;
	
	@Bean
	public static PropertySourcesPlaceholderConfigurer propertyConfiure() {
		return new PropertySourcesPlaceholderConfigurer();
	}

	public void outputResource() {
		try {
			System.out.println(normal);
			System.out.println(osName);
			System.out.println(randomNumber);
			System.out.println(fromAnother);

			System.out.println(IOUtils.toString(testFile.getInputStream()));
			System.out.println(IOUtils.toString(testUrl.getInputStream()));
			System.out.println(bookName);
			System.out.println(environment.getProperty("book.author"));
			
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}
}
