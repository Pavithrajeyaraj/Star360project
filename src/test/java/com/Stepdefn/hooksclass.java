package com.Stepdefn;

import com.Base.BaseClass;

import cucumber.api.java.Before;

public class hooksclass extends BaseClass {
	@Before
	public void beforeMethod() {
		browserLaunch();
		driver.manage().window().maximize();
	}

}
