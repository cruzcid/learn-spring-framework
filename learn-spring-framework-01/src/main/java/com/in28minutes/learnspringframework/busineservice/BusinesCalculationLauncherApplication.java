package com.in28minutes.learnspringframework.busineservice;

import java.util.Arrays;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Component;


@Configuration
@ComponentScan
public class BusinesCalculationLauncherApplication {
	
	public static void main(String[] args) {				
		var context = new AnnotationConfigApplicationContext
				(BusinesCalculationLauncherApplication.class);
		
		Arrays.stream(context.getBeanDefinitionNames())
			.forEach(System.out::println);
		
		// This automatically calls the toString() method. 
		BusinessCalculationService businessService = context.getBean(BusinessCalculationService.class);
		System.out.println(businessService);
		System.out.println("---");
		System.out.print(businessService.findMax());
	}
}
