package com.in28minutes.learnspringframework.examples.f1;

import java.util.Arrays;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Component;

import jakarta.annotation.PostConstruct;
import jakarta.annotation.PreDestroy;

@Component
class SomeClass {
	private SomeDependency someDependency;
	
	public SomeClass(SomeDependency someDependency) {
		super();
		this.someDependency = someDependency;
		System.out.println("All dependencies are ready!");
	}
	
	@PostConstruct
	public void initiate() {
		System.out.println("Using PostConstruct is cool isn't it?... "
				+ "Right after the constructor");
	}
	
	@PreDestroy
	public void cleanUp() {
		System.out.println("CleanUP up up!");
	}
}

@Component
class SomeDependency {
	public void getReady() {
		System.out.println("Dependency is ready Miawww!");
	}
}
@Configuration
@ComponentScan
public class PrePostAnnotationsContextLauncherApplication {
	
	public static void main(String[] args) {				
		var context = new AnnotationConfigApplicationContext
				(PrePostAnnotationsContextLauncherApplication.class);
		
		Arrays.stream(context.getBeanDefinitionNames())
			.forEach(System.out::println);
	}
}
