package com.in28minutes.learnspringframework;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

import com.in28minutes.learnspringframework.game.GameRunner;
import com.in28minutes.learnspringframework.game.GamingConsole;


@Configuration
@ComponentScan("com.in28minutes.learnspringframework.game")
public class App03GamingBasicJava2 {
	
	@Bean
	public GameRunner gameRunner(GamingConsole game) {
		System.out.println("Parameter: " + game);
		var gameRunner = new GameRunner(game);
		return gameRunner;
	}
	
	public static void main(String[] args) {				
		var context = new AnnotationConfigApplicationContext
				(App03GamingBasicJava2.class);
		
		context.getBean(GamingConsole.class).up();
		context.getBean(GameRunner.class).run();
	}
}
