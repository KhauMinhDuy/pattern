package com.khauminhduy.flyweight;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotEquals;
import static org.junit.Assert.assertNotNull;

import java.awt.Color;

import org.junit.Test;

public class FlyweightUnitTest {

	@Test
	public void givenDifferentFlyweightObjects_whenEquals_thenFalse() {
		Vehicle blackVehicle = VehicleFactory.createVehicle(Color.BLACK);
		Vehicle blueVehicle = VehicleFactory.createVehicle(Color.BLUE);
		System.out.println(blackVehicle);
		System.out.println(blueVehicle);
		
		assertNotNull("Object returned by the factory is null!", blackVehicle);
		assertNotNull("Object returned by the factory is null!", blueVehicle);
		assertNotEquals("Objects returned by the factory are equals!", blackVehicle, blueVehicle);
	}
	
	@Test
	public void givenSameFlyweightObjects_whenEquals_thenTrue() {
		Vehicle blackVehicle = VehicleFactory.createVehicle(Color.BLACK);
		Vehicle anotherBlackVehicle = VehicleFactory.createVehicle(Color.BLACK);
		System.out.println(blackVehicle);
		System.out.println(anotherBlackVehicle);
		
		assertNotNull("Object returned by the factory is null!", blackVehicle);
		assertNotNull("Object returned by the factory is null!", anotherBlackVehicle);
		assertEquals("Objects returned by the factory are not equals!", blackVehicle, anotherBlackVehicle);
	}
	
}
