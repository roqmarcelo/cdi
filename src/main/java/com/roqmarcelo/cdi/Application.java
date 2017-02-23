package com.roqmarcelo.cdi;

import javax.inject.Inject;
import javax.inject.Singleton;

import com.roqmarcelo.cdi.annotation.GreetingType;
import com.roqmarcelo.cdi.annotation.Type;

@Singleton
public class Application {

	@Inject @Type(GreetingType.FORMAL)
	Greeting greeting;
	
	public void run() {
		System.out.println(greeting.greet());
	}
}