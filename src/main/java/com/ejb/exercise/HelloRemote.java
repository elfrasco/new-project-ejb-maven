package com.ejb.exercise;

import javax.ejb.Remote;

@Remote
public interface HelloRemote {

	String greet(String name);
	
}
