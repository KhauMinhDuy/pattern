package com.khauminhduy.ps.chain;

public class CEO extends Handler {

	@Override
	public void handlerRequest(Request request) {
		System.out.println("CEOs can approve anything they want");		
	}
	
}
