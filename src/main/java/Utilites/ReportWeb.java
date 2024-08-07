package Utilites;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import net.masterthought.cucumber.Configuration;
import net.masterthought.cucumber.ReportBuilder;

public class ReportWeb {

	public void generateReport(String JsonFile, String formatWithoutSpace) throws IOException {

		Configuration config = new Configuration(new File(System.getProperty("user.dir") + "/Reports/HTML/"),
				"Smart_Rewards");

		List<String> JsonFiles = new ArrayList<>();
		JsonFiles.add(JsonFile);
		ReportBuilder report = new ReportBuilder(JsonFiles, config);
		report.generateReports();
	}

}
