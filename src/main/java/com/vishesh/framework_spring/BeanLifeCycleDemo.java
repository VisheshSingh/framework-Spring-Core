package com.vishesh.framework_spring;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class BeanLifeCycleDemo {

	public static void main(String[] args) {
		// load the spring config file
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext(
				"beanLifecycle-applicationContext.xml");

		// retrieve the bean
		Coach theCoach = context.getBean("myCoach", Coach.class);

		// call the bean methods
		System.out.println(theCoach.getDailyFortune());

		// close the context
		context.close();

	}

}
