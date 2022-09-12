package com.khauminhduy.bd.nullobject;

public class SmsRouter implements Router{

	@Override
	public void route(Message message) {
		System.out.println("Routing to a SMS gateway. Msg: " + message);		
	}
	
}
