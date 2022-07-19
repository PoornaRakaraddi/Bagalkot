package org.test.practice;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class TestNgPractice {
	
	@Test
	public void CreateCustomer() {
		Reporter.log("poorna",true);
	}
	@Test
	public void DeleteCustomer() {
		Reporter.log("vidya",true);
	}

}
