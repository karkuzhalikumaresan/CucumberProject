package com.omrbranch.stepdefinition;

import java.io.FileNotFoundException;
import java.io.IOException;

import com.omrbranch.baseclass.BaseClass;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.Scenario;

public class HooksClass extends BaseClass {
	
	@Before
	public void beforeScenario() throws FileNotFoundException, IOException {
		 browserLaunch(getPropertyFileValue("browser"));
		    enterApplnUrl(getPropertyFileValue("url"));
		    maximizeWindow();
		    implictWait();
		
	}
	
	@After
	public void AfterScenario(Scenario scenario) {
		
		boolean b = scenario.isFailed();
		
		if(!b) {
			scenario.attach(screenshot(), "images/png", "Every Scenario");
		}
		//closeAllWindow();
		
	}

}
