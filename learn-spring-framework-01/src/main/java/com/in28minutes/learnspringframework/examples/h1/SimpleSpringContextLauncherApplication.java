package com.in28minutes.learnspringframework.examples.h1;

import java.util.Arrays;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;


@Configuration
@ComponentScan
public class SimpleSpringContextLauncherApplication {
	
	public static void main(String[] args) {				
		var context = new AnnotationConfigApplicationContext
				(SimpleSpringContextLauncherApplication.class);
		
		Arrays.stream(context.getBeanDefinitionNames())
			.forEach(System.out::println);
	}
}
