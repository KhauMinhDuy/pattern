package com.khauminhduy.bd.visitor;

import java.util.ArrayList;
import java.util.List;

public class Document extends Element{

	private List<Element> elements = new ArrayList<>();

	public Document(String uuid) {
		super(uuid);
	}

	public void add(Element element) {
		elements.add(element);
	}

	@Override
	public void accept(Visitor visitor) {
		for(Element element : elements) {
			element.accept(visitor);
		}		
	}
	
}
