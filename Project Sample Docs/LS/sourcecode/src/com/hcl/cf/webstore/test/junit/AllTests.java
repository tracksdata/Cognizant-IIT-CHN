package com.hcl.cf.webstore.test.junit;

import junit.framework.Test;
import junit.framework.TestSuite;

public class AllTests {

	public static Test suite() {
		TestSuite suite = new TestSuite(
		"Test for com.hcl.cf.webstore.test.junit");
		//$JUnit-BEGIN$
		suite.addTestSuite(TestWebStorePOJO_Add.class);
		suite.addTestSuite(TestWebStorePOJO_Select.class);
		suite.addTestSuite(TestWebStorePOJO_Update.class);
		suite.addTestSuite(TestWebStorePOJO_Remove.class);
		//$JUnit-END$
		return suite;
	}
}