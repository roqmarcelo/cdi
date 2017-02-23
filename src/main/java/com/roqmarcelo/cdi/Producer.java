package com.roqmarcelo.cdi;

import javax.enterprise.context.ApplicationScoped;
import javax.enterprise.inject.Produces;

import com.roqmarcelo.cdi.annotation.GreetingType;
import com.roqmarcelo.cdi.annotation.Type;

@ApplicationScoped
public class Producer {

	@Produces @Type(GreetingType.INFORMAL)
	public Greeting informal() {
		return new InformalGreeting();
	}
	
	@Produces @Type(GreetingType.FORMAL)
	public Greeting formal() {
		return new FormalGreeting();
	}
}