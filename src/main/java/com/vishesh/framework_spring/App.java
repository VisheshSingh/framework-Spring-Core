package com.vishesh.framework_spring;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App {
	public static void main(String[] args) {

		// load the spring config file
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");

		// retrieve the bean
		Coach theCoach = context.getBean("myCoach", Coach.class);

		// call the methods on the bean
		System.out.println(theCoach.getDailyWorkout());

		// Call the new methods
		System.out.println(theCoach.getDailyFortune());

		// close the context
		context.close();
	}
}
