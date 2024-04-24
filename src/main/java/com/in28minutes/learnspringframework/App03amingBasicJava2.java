package com.in28minutes.learnspringframework;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class App03amingBasicJava2 {
	public static void main(String[] args) {
		var context = new AnnotationConfigApplicationContext
				(GamingConfiguration.class);
		//context.getBean(Ga);
	}
}
