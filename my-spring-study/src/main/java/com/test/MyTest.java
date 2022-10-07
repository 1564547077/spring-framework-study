package com.test;

import com.test.entity.Bean;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.DispatcherServlet;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;
import java.util.HashMap;
import java.util.Map;

public class MyTest {

	@RequestMapping
	public static void main(String[] args) {
		/*ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
		Bean bean = context.getBean("person", Bean.class);
		System.out.println(bean.toString());
		context.close();*/
//		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(SpringConfig.class);

		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
		Bean bean = context.getBean("bean", Bean.class);
		System.out.println(bean);
		context.close();
		DispatcherServlet dispatcherServlet;
	}
}
