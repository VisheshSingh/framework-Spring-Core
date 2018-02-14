package com.vishesh.framework_spring;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class BeanScopeDemo {

	public static void main(String[] args) {

		// load the config file
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("beanScope-applicationContext.xml");

		// retrieve bean from the spring container
		Coach theCoach = context.getBean("myCoach", Coach.class);

		Coach alphaCoach = context.getBean("myCoach", Coach.class);

		// Check to see if these are same beans
		boolean result = (theCoach == alphaCoach);

		System.out.println("Pointing to the same reference: " + result);

		System.out.println("Memory location for theCoach: " + theCoach);

		System.out.println("Memory location for alphaCoach: " + alphaCoach);

		// close the context
		context.close();
	}

}
