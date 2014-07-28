package com.ejb.exercise;

import javax.ejb.Stateless;

@Stateless
public class HelloRemoteBean implements HelloRemote {

	@Override
	public String greet(String name) {
		return "Hello " + name;
	}

}
