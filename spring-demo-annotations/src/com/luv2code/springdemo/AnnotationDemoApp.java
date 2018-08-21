package com.luv2code.springdemo;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class AnnotationDemoApp {

	public static void main(String[] args) {
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
		
		TennisCoach theCoach = context.getBean("tennisCoach",TennisCoach.class);
		System.out.println(theCoach.getDailyWorkout() + " " + theCoach.getDailyFortunes() + " " + theCoach.getEmail());
		
//		Coach theFunnyCoach = context.getBean("rugbyCoach",Coach.class);
//		
//		System.out.println(theFunnyCoach.getDailyWorkout() + " " + theFunnyCoach.getDailyFortunes());

		context.close();

	}

}
