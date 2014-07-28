package com.ejb.exercise;

import org.junit.Assert;
import org.junit.Test;


public class HelloBeanTest {

	private HelloBean helloBean = new HelloBean();
	
	@Test
	public void greet() {
		String greetings = helloBean.greet("Adrian");
		Assert.assertEquals("Hello Adrian", greetings);
	}
}
