package com.khauminhduy.ps.chain;

public class VP extends Handler {

	@Override
	public void handlerRequest(Request request) {
		if (request.getRequestType() == RequestType.PURCHASE && request.getAmount() < 1500) {
			System.out.println("Vps can approve purchases below 1500");
		} else {
			successor.handlerRequest(request);
		}
	}

}
