package com.khauminhduy.bd.observer;

import java.util.Observable;
import java.util.Observer;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class ONewsChannel implements Observer {

	private String news;

	@Override
	public void update(Observable o, Object news) {
		this.setNews((String) news);
	}

}
