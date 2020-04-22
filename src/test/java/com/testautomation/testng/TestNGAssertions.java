package com.testautomation.testng;

import org.testng.Assert;
import org.testng.annotations.Test;

public class TestNGAssertions {

	@Test
	public void test1() {
		String a = "Hello ";
		String b = "World";
		Assert.assertEquals("Hello World", a + b);
	}

	@Test
	public void test2() {
		String a = "Hello";
		String b = "World";
		Assert.assertNotEquals("Hello World", a + b);
	}

	@Test
	public void test3() {
		boolean a = true;
		Assert.assertTrue(a);
	}

}
