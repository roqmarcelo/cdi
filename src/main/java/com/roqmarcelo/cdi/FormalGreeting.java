package com.roqmarcelo.cdi;

public class FormalGreeting implements Greeting {

	@Override
	public String greet() {
		return "Hello, sir";
	}
}