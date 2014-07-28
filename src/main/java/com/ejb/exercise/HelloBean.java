package com.ejb.exercise;

import javax.ejb.Stateless;

@Stateless
public class HelloBean {

	public String greet(String name) {
		return "Hello " + name;
	}
}
