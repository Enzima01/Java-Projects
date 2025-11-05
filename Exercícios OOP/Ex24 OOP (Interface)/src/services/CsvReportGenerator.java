package services;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class CsvReportGenerator implements ReportGenerator {

	public void generate(String content) {

		File csvFile = new File("C:\\interface\\CSV\\Report.csv");
		try (BufferedWriter bw = new BufferedWriter(new FileWriter(csvFile, true))) {
			bw.write("CSV report created: " + content);
			System.out.println("CSV file created and updated!");
		} catch (IOException e) {
			e.printStackTrace();
		}

	}
}
