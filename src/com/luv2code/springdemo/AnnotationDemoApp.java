package com.luv2code.springdemo;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class AnnotationDemoApp {

	public static void main(String[] args) {
		
		//read the spring config file
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
		
		//get the bean from the bean container
		Coach theCoach =  context.getBean("tennisCoach",TennisCoach.class);
		
		//call method on the bean
		System.out.println(theCoach.getDailyWorkout());
		System.out.println(theCoach.getDailyFortune());
		
		//close the context
		context.close();

	}

}
