package com.omrbranch.runner;

import org.junit.AfterClass;
import org.junit.runner.RunWith;

import com.omrbranch.report.Reporting;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import io.cucumber.junit.CucumberOptions.SnippetType;

@RunWith(Cucumber.class)
@CucumberOptions(dryRun=false,snippets=SnippetType.CAMELCASE,plugin={"pretty","json:target//index.json"},
name="Verify omrbaranch login with valid data",glue="com.omrbranch.stepdefinition",features="src\\test\\resources"
)

public class TestRunnerClass {
	
	@AfterClass
	public static void afterClass() {
		Reporting.generateJvmReport("C:\\Users\\karku\\eclipse-workspace\\OMRBranchHotelAutomationProject\\target\\index.json");
	}

}
