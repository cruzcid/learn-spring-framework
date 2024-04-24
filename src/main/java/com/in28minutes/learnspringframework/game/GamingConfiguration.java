package com.in28minutes.learnspringframework.game;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class GamingConfiguration {
	
	@Bean
	public MarioGame game() {
		var marioGame = new MarioGame();
		return marioGame;
	}
	
	// var gameRunner = new GameRunner(marioGame);
	// gameRunner.run();
}
