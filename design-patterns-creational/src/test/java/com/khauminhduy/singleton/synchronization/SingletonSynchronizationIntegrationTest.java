package com.khauminhduy.singleton.synchronization;

import static org.junit.Assert.assertEquals;

import java.util.Collections;
import java.util.HashSet;
import java.util.Set;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

import org.junit.Test;

public class SingletonSynchronizationIntegrationTest {

	private static final int POOL_SIZE = 1_000;
	
	private static final int TASKS_TO_SUBMIT = 1_000_000;
	
	@Test
	public void givenDraconianSingleton_whenMultithreadInstancesEquals_thenTrue() {
		ExecutorService executor = Executors.newFixedThreadPool(POOL_SIZE);
		Set<DraconianSingleton> resultSet = Collections.synchronizedSet(new HashSet<>());
		
		for(int i = 0; i < TASKS_TO_SUBMIT; i++) {
			executor.submit(() -> resultSet.add(DraconianSingleton.getInstance()));
		}
		
		assertEquals(1, resultSet.size());
	}
	
	@Test
	public void givenDclSingleton_whenMultithreadInstancesEquals_thenTrue() {
		ExecutorService excecutor = Executors.newFixedThreadPool(POOL_SIZE);
		Set<DclSingleton> resultSet = Collections.synchronizedSet(new HashSet<>());
		
		for(int i = 0; i < TASKS_TO_SUBMIT; i++) {
			excecutor.submit(() -> resultSet.add(DclSingleton.getInstance()));
		}
		
		assertEquals(1, resultSet.size());
	}
	
	@Test
	public void givenEarlyInitSingleton_whenMultithreadInstancesEquals_thenTrue() {
		ExecutorService executor = Executors.newFixedThreadPool(POOL_SIZE);
		Set<EarlyInitSingleton> resultSet = Collections.synchronizedSet(new HashSet<>());
		
		for(int i = 0; i < TASKS_TO_SUBMIT; i++) {
			executor.submit(() -> resultSet.add(EarlyInitSingleton.getInstance()));
		}
		
		assertEquals(1, resultSet.size());
	}
	
	@Test
	public void givenInitOnDemandSingleton_whenMultithreadInstancesEquals_thenTrue() {
		ExecutorService executor = Executors.newFixedThreadPool(POOL_SIZE);
		Set<InitOnDemandSingleton> resultSet = Collections.synchronizedSet(new HashSet<>());
		
		for(int i = 0; i < TASKS_TO_SUBMIT; i++) {
			executor.submit(() -> resultSet.add(InitOnDemandSingleton.getInstance()));
		}
		
		assertEquals(1, resultSet.size());
	}
	
	@Test
	public void givenEnumSingleton_whenMultithreadInstancesEquals_thenTrue() {
		ExecutorService executor = Executors.newFixedThreadPool(POOL_SIZE);
		Set<EnumSingleton> resultSet = Collections.synchronizedSet(new HashSet<>());
		
		for(int i = 0; i < TASKS_TO_SUBMIT; i++) {
			executor.submit(() -> resultSet.add(EnumSingleton.INSTANCE));
		}
		
		assertEquals(1, resultSet.size());
	}
}
