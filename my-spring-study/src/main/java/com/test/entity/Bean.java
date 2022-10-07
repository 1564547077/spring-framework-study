package com.test.entity;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.InitializingBean;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

@Component
@Scope("prototype")
public class Bean implements InitializingBean , ApplicationContextAware {

	@Value("王五")
	private String name;

	@Autowired
	PersonInfo personInfo;

	@Autowired
	PersonInfo personBySet;

	@PostConstruct
	public void postConstructMethod1() {
		System.out.println("使用了PostConstruct");
	}


	/*
	 * 反射默认是无参构造
	 * 也是Bean生命周期第一步
	 * */
	public Bean() {
		System.out.println("使用反射创建无参构造函数");
	}

	public void setName(String name) {
		this.name = name;
	}

	@Autowired
	public void setPersonBySet(PersonInfo personBySet) {
		this.personBySet = personBySet;
	}

	@PreDestroy
	public void destoryMethod() {
		System.out.println("这是销毁调用的回调函数");
	}

	@PostConstruct
	public void initMethod() {
		System.out.println("注解的方式被调用了初始化方法");
	}


	@Override
	public void afterPropertiesSet() throws Exception {
		System.out.println("实现了InitializingBean接口");
	}

	@Override
	public void setApplicationContext(ApplicationContext applicationContext) throws BeansException {
		System.out.println("进入到aware");
	}
}
