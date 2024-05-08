package com.in28minutes.learnspringframework.examples.e1;

import java.util.Arrays;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;


@Configuration
@ComponentScan
public class SimpleSpringContextLauncherApplication2 {
	
	public static void main(String[] args) {				
		var context = new AnnotationConfigApplicationContext
				(SimpleSpringContextLauncherApplication2.class);
		
		Arrays.stream(context.getBeanDefinitionNames())
			.forEach(System.out::println);
	}
}
