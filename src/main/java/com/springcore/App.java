package com.springcore;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println("Hello Spring...!");
		
		 ApplicationContext context= new ClassPathXmlApplicationContext("config.xml");
		 Student student= (Student)context.getBean("Student1");
		 System.out.println("Student Details :"  +student);
	}

}
