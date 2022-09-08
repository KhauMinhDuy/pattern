package com.khauminhduy.bd.visitor;

import java.util.UUID;

public class VisitorDemo {
	
	public static void main(String[] args) {
		Visitor visitor = new ElementVisitor();

		Document document = new Document(generateUuid());
		document.add(new JsonElement(generateUuid()));
		document.add(new JsonElement(generateUuid()));
		document.add(new XmlElement(generateUuid()));

		document.accept(visitor);
	}

	private static String generateUuid() {
		return UUID.randomUUID().toString();
	}

}
