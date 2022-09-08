package com.khauminhduy.observer;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

import com.khauminhduy.bd.observer.NewsAgency;
import com.khauminhduy.bd.observer.NewsChannel;
import com.khauminhduy.bd.observer.ONewsAgency;
import com.khauminhduy.bd.observer.ONewsChannel;
import com.khauminhduy.bd.observer.PCLNewsAgency;
import com.khauminhduy.bd.observer.PCLNewsChannel;

public class ObserverIntegrationTest {

	@Test
	public void whenChangingNewsAgencyState_thenNewsChannelNotified() {
		NewsAgency observable = new NewsAgency();
		NewsChannel observer = new NewsChannel();

		observable.addObserver(observer);
		observable.setNews("news");

		assertEquals("news", observer.getNews());
	}

	@Test
	public void whenChangingONewsAgencyState_thenONewsChannelNotified() {
		ONewsAgency observable = new ONewsAgency();
		ONewsChannel observer = new ONewsChannel();

		observable.addObserver(observer);
		observable.setNews("abc");

		assertEquals("abc", observer.getNews());
	}

	@Test
	public void whenChangingPCLNewsAgencyState_thenONewsChannelNotified() {
		PCLNewsAgency observable = new PCLNewsAgency();
		PCLNewsChannel observer = new PCLNewsChannel();

		observable.addPropertyChangeListener(observer);
		observable.setNews("123");

		assertEquals("123", observer.getNews());

	}

}
