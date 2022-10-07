package com.test.entity;

import org.springframework.context.ApplicationListener;
import org.springframework.context.event.ContextRefreshedEvent;
import org.springframework.stereotype.Component;

@Component
public class MyListenerBean implements ApplicationListener<ContextRefreshedEvent> {

	static {
		System.out.println("我的ApplicationListener被访问了");
	}

	public MyListenerBean() {
		System.out.println("我的ApplicationListener被创建了");
	}

	@Override
	public void onApplicationEvent(ContextRefreshedEvent event) {

	}
}
