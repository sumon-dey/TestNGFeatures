/*Running TestNG from the main() method of Java */
package com.testautomation.testng;

import java.util.List;
import org.testng.TestListenerAdapter;
import org.testng.TestNG;

import com.beust.jcommander.internal.Lists;

public class TestNGRunFrom_main_Method {

	public static void main(String[] args) {
		TestListenerAdapter TestListenerAdapter = new TestListenerAdapter();
		TestNG testNG = new TestNG();
		List<String> suites = Lists.newArrayList();
		suites.add("./src/test/java/com/testautomation/testng/testng1.xml");
		suites.add("./src/test/java/com/testautomation/testng/testng2.xml");
		suites.add("./src/test/java/com/testautomation/testng/testng3.xml");
		suites.add("./src/test/java/com/testautomation/testng/testng4.xml");
		testNG.setTestSuites(suites);
		testNG.run();
	}
}
