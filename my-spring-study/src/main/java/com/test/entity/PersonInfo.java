package com.test.entity;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class PersonInfo {

	public PersonInfo() {
		System.out.println("personInfo 被实例化");
	}

	private String name;

	private String age;

	public void setAge(String age) {
		this.age = age;
	}
}
