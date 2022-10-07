package com.test.config;

import com.test.entity.CarInfo;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class BeanConfig {

	static {
		System.out.println("BeanConfig类被引用");
	}
	public BeanConfig() {
		System.out.println("Config类被创建");
	}

	@Bean
	public CarInfo carInfo() {
		return new CarInfo();
	}

}
