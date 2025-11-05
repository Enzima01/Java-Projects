package entities;

import services.ReportGenerator;

public class Report {
	private ReportGenerator generator;

	public Report(ReportGenerator generator) {
		this.generator = generator;
	}

	public void export(String content) {
		generator.generate(content);
	}

}
