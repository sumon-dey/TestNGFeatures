package com.testautomation.testng;

import java.util.ArrayList;
import java.util.Iterator;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class TestNGDataProvider {

	@Test(dataProvider = "getData1")
	public void showData1(int int1, String str1) {
		System.out.println("showData1 -> int1 = " + int1 + ", str1 = " + str1);
	}

	@Test(dataProvider = "getData2")
	public void showData2(String str2, String str3) {
		System.out.println("showData2 -> str2 = " + str2 + ", str3 = " + str3);
	}

	@DataProvider
	public Object[][] getData1() {
		return new Object[][] { { 1, "Java" }, { 2, "Python" } };
	}

	@DataProvider
	public Iterator<Object[]> getData2() {
		Object[] obj1 = { "JavaSript", "Kotlin" };
		ArrayList<Object[]> testData = new ArrayList<>();
		testData.add(obj1);
		return testData.iterator();
	}

}
