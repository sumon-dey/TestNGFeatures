package com.testautomation.testng;

import org.testng.annotations.Test;

public class TestNGPriorityAndGroups {

	@Test(priority = 3, groups = "Regression")
	public void myTest1() {
		System.out.println("Inside myTest1() method");
	}

	@Test(priority = 1, groups = "Regression")
	public void myTest2() {
		System.out.println("Inside myTest2() method");
	}

	@Test(priority = 2, groups = "Smoke")
	public void myTest3() {
		System.out.println("Inside myTest3() method");
	}

}
