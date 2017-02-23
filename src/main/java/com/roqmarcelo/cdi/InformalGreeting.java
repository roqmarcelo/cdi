package com.roqmarcelo.cdi;

public class InformalGreeting implements Greeting {

	@Override
	public String greet() {
		return "Yo, homie";
	}
}