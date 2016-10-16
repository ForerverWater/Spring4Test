package com.water.spring4test.ch2.scope;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

/**
 * Bean的Scope
 * Singleton:一个Spring容器中只有一个Bean的实例,此为Spring的默认配置
 * Prototype:每次调用新建一个Bean的实例
 * Request:web项目中,给每一个request新建一个Bean对象
 * Session:web项目种,给每一个session新建一个Bean对象
 * @author PC
 *
 */
@Configuration
@ComponentScan("com.water.spring4test.ch2.scope")
public class ScopeConfig {

}
