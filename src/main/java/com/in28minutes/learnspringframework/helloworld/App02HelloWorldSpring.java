package com.in28minutes.learnspringframework.helloworld;

import java.util.Arrays;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class App02HelloWorldSpring {
	public static void main(String[] args) {
		//1. Launch a Spring context
		try (var context = 
				new AnnotationConfigApplicationContext(HelloWorldConfiguration.class)) {
			//2. Configure the things that we want Spring to manage
			// HelloWorldConfiguration - @Configuration
			//namez - @Bean
			
			//3. Retrieving beans managed by Spring
			System.out.println(context.getBean("namez"));
			
			System.out.println(context.getBean("age"));
			
			System.out.println(context.getBean("person"));
			
			System.out.println(context.getBean("person2MethodCall"));
			
			System.out.println(context.getBean("person3Parameters"));
			
			System.out.println(context.getBean("addressNameChangedWithThisAnnotation"));
			// This also call a bean
			System.out.println(context.getBean(Address.class));
			
			System.out.println(context.getBean("person5Qualifier"));
			
			Arrays.stream(context.getBeanDefinitionNames())
				.forEach(System.out::println);

		}		
	}
}
