package org.thinker.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class MyAppConfig {

	@Bean
	public HelloWorld getHelloWorld(){
		
		return new HelloWorld();
	}
	
}
