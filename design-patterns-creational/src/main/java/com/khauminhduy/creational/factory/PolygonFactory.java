package com.khauminhduy.creational.factory;

public class PolygonFactory {

	public Polygon getPolygon(PolygonType type) {
		if(type == PolygonType.Triangle) {
			return new Triangle();
		} else if(type == PolygonType.Square) {
			return new Square();
		} else if(type == PolygonType.Pentagon) {
			return new Pentagon();
		} else if(type == PolygonType.Heptagon) {
			return new Heptagon();
		} else if(type == PolygonType.Octagon) {
			return new Octagon();
		}
		return null;
	}
}
