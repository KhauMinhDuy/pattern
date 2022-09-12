package com.khauminhduy.bd.nullobject;

public class JmsRouter implements Router {

	@Override
	public void route(Message message) {
		System.out.println("Routing to a JMS queue. Msg: " + message);		
	}
	
}
