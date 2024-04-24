package com.in28minutes.learnspringframework.game;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;


@Component
@Primary
public class PacmanGame implements GamingConsole{

	@Override
	public void up() {
		System.out.println("Upy");
		
	}

	@Override
	public void down() {
		System.out.println("dowy");
		
	}

	@Override
	public void left() {
		System.out.println("lefty");
		
	}

	@Override
	public void right() {
		System.out.println("righty");
		
	}

}
