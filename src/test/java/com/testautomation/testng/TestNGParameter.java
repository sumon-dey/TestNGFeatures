package com.testautomation.testng;

import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class TestNGParameter {
	
	@Test
    @Parameters({"name1","name2"})
	public void test1(String name1, String name2) {
		System.out.println(name1+", "+name2);
	}

}
