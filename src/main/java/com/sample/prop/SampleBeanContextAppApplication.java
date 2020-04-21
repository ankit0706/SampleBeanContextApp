package com.sample.prop;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;


public class SampleBeanContextAppApplication {

	public static void main(String[] args) {
		//SpringApplication.run(SampleBeanContextAppApplication.class, args);
		ApplicationContext context = new ClassPathXmlApplicationContext("application-context.xml");
		Object o = context.getBean("dbConfig");
		System.out.println(o.toString());
	}

}
