package com.khauminhduy.creational.factory;

public class FactoryDriver {

	public static void main(String[] args) {
		Polygon polygon;
		PolygonFactory factory = new PolygonFactory();
		polygon = factory.getPolygon(PolygonType.Square);
		System.out.println("The shape with sides is a " + polygon.getType());
		
		polygon = factory.getPolygon(PolygonType.Octagon);
		System.out.println("The shape with sides is a " + polygon.getType());
	}
	
}
