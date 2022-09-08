package com.khauminhduy.bd.observer;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class NewsChannel implements Channel {

	private String news;

	@Override
	public void update(Object news) {
		this.setNews((String) news);
	}

}
