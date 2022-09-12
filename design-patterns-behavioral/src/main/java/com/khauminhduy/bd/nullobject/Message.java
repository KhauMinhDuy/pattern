package com.khauminhduy.bd.nullobject;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.ToString;

@AllArgsConstructor
@ToString
public class Message {

	private String body;

	@Getter
	private String priority;

}
