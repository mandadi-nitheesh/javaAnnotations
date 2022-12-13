package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.example.demo.anotations.Demo;

@SpringBootApplication
public class Springcore2Application {

	public static void main(String[] args) {
		SpringApplication.run(Springcore2Application.class, args);
		
		
//		ApplicationContext context=new ClassPathXmlApplicationContext("Books.xml");
//		
//		Student student=context.getBean("student",Student.class);
//		student.readbook();
		
		
		ApplicationContext context=new ClassPathXmlApplicationContext("Demo.xml");
		
	Demo demo=	context.getBean("demo",Demo.class);
	
	demo.display();
		
		
		
	}

}
