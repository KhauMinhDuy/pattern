package com.khauminhduy.bd.observer;

import java.beans.PropertyChangeEvent;
import java.beans.PropertyChangeListener;

import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
public class PCLNewsChannel implements PropertyChangeListener {

	private String news;

	@Override
	public void propertyChange(PropertyChangeEvent evt) {
		this.setNews((String) evt.getNewValue());
	}

}
