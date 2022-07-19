package org.test.practice;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class TestNgPracticeTest {
	@Test
	public void Delete(){
		Reporter.log("chrome",true);
	}

@Test
public void create() {
	Reporter.log("firefox",true);
}
  }

