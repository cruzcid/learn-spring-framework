package com.in28minutes.learnspringframework.helloworld;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;

record Person (String name, int age, Address address) { };

record Address (String firstLine, String city) {};

@Configuration
public class HelloWorldConfiguration {
	
	@Bean
	public String namez() {
		return "Cruzito";
	}
	
	@Bean
	public int age() {
		return 32;
	}
	
	@Bean 
	public Person person() {
		return new Person("Julius", 44, address());
	}
	
	@Bean
	public Person person2MethodCall() {
		return new Person(namez(), age(), new Address("Col. del Valle", "CDMX"));
	}
	
	@Bean
	public Person person3Parameters(String name, int age, Address address3) {
		return new Person(name, age, address3);
	}
	
	@Bean 
	public Person person5Qualifier(String name, int age, @Qualifier("address3qualifier") Address address) {
		return new Person(name, age, address);		
	}
	// @Primary annotation help to select the specific Spring Bean that should match (in case there are many beans)
	@Bean(name = "addressNameChangedWithThisAnnotation")
	@Primary()
	public Address address() {
		return new Address("Jose Ancona 22", "Mexico city");
	}
	
	@Bean(name = "address3")
	@Qualifier("address3qualifier")
	public Address address3() {
		return new Address("Chicago", "USA");
	}
}
