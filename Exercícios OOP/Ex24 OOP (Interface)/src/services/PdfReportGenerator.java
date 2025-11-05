package services;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class PdfReportGenerator implements ReportGenerator {
	public void generate(String content) {

		File pdfFile = new File("C:\\interface\\PDF\\Report.pdf");
		try (BufferedWriter bw = new BufferedWriter(new FileWriter(pdfFile, true))) {
			bw.write("PDF report created: " + content);
			System.out.println("PDF file created and updated!");
		} catch (IOException e) {
			e.printStackTrace();
		}

	}
}
