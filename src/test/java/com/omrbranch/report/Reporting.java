package com.omrbranch.report;

import java.io.File;
import java.util.ArrayList;
import java.util.List;

import net.masterthought.cucumber.Configuration;
import net.masterthought.cucumber.ReportBuilder;

public class Reporting {
	public static void generateJvmReport(String jsonFile) {
		File file=new File("C:\\Users\\karku\\eclipse-workspace\\OMRBranchHotelAutomationProject\\target");
		Configuration config=new Configuration(file,"OMRproject");
		config.addClassifications("Browser", "Chrome");
		config.addClassifications("BrowserVersion", "144");
		config.addClassifications("OS", "Win 11");
		config.addClassifications("Sprint", "34");
		List<String> jsonFiles=new ArrayList<>();
		jsonFiles.add(jsonFile);
		ReportBuilder builder=new ReportBuilder(jsonFiles, config);
		builder.generateReports();
	}

}
