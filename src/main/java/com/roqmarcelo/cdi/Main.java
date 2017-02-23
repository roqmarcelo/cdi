package com.roqmarcelo.cdi;

public class Main {

	public static void main(String[] args) {
		CdiContext context = CdiContext.INSTANCE;
		
		Application application = context.getBean(Application.class);
		
		application.run();
	}
}