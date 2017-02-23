package com.roqmarcelo.cdi;

import org.jboss.weld.environment.se.Weld;
import org.jboss.weld.environment.se.WeldContainer;

public enum CdiContext {

	INSTANCE;
	
    private final WeldContainer container;
	
	private CdiContext() {
		final Weld weld = new Weld();
		this.container = weld.initialize();
		
		Runtime.getRuntime().addShutdownHook(new Thread() {
            @Override
            public void run() {
                weld.shutdown();
            }
        });
	}
	
	public <T> T getBean(Class<T> type) {
        return container.instance().select(type).get();
    }
}