package com.in28minutes.learnspringframework.game;

public class PackmanGame implements GamingConsole{

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
