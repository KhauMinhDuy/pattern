package com.khauminhduy.ps.chain;

public class Director extends Handler {

	@Override
	public void handlerRequest(Request request) {
		if(request.getRequestType() == RequestType.CONFERENCE) {
			System.out.println("Director can appprove conferences");
		}	else {
			successor.handlerRequest(request);
		}
	}

}
