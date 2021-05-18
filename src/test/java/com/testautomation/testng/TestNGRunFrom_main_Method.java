/*Running TestNG from the main() method of Java */
package com.testautomation.testng;

import java.util.ArrayList;
import java.util.List;
import org.testng.ITestNGListener;
import org.testng.TestListenerAdapter;
import org.testng.TestNG;
import org.testng.xml.XmlSuite;

public class TestNGRunFrom_main_Method {

	// if you want to run from command line, you have to use the below command:
	// java -jar TestNGFeatures.jar <the testng xml file you want to run>
	public static void main(String[] args) {
		TestNG testNG = new TestNG();
		TestListenerAdapter adapter = new TestListenerAdapter();
		List<String> suites = new ArrayList<>();
		testNG.addListener((ITestNGListener) adapter);
		suites.add("./src/test/java/com/testautomation/testng/main_testng.xml");
		suites.add("./src/test/java/com/testautomation/testng/testng1.xml");
		suites.add("./src/test/java/com/testautomation/testng/testng2.xml");
		suites.add("./src/test/java/com/testautomation/testng/testng3.xml");
		suites.add("./src/test/java/com/testautomation/testng/testng4.xml");
		testNG.setTestSuites(suites);
		testNG.setParallel(XmlSuite.ParallelMode.METHODS);
		testNG.setPreserveOrder(true);
		testNG.setSuiteThreadPoolSize(5);
		testNG.setVerbose(0);
		testNG.setOutputDirectory("test-output");
		testNG.run();
	}
}
