package com.khauminhduy.prototype;

public class PlasticTree extends Tree {

	private String name;

	public PlasticTree(double mass, double height) {
		super(mass, height);
		this.name = "PlasticTree";
	}

	@Override
	public Tree copy() {
		PlasticTree plasticTreeClone = new PlasticTree(this.getMass(), this.getHeight());
    plasticTreeClone.setPosition(this.getPosition());
    return plasticTreeClone;
	}

}
