/* PT-BR|
 * Desenvolva um sistema que gere relatórios em diferentes formatos (PDF e CSV).
 * Crie uma interface e uma classe que exporte o conteúdo.
 * No programa principal, o usuário deve escolher o formato do relatório e o conteúdo, e o sistema deve criar o arquivo correspondente no diretório especificado.
 * 
 * EN|
 * Develop a system that generates reports in different formats (PDF and CSV).
 * Create an interface and a class that exports the content.
 * In the main program, the user should choose the report format and content, and the system should create the corresponding file in the specified directory.
 */

package application;

import java.io.File;
import java.util.Scanner;

import entities.Report;
import services.CsvReportGenerator;
import services.PdfReportGenerator;

public class Program {

	public static void main(String[] args) {
		boolean createFolder = new File("C:\\" + "interface").mkdir();
		Scanner sc = new Scanner(System.in);
		System.out.println("Type the number of file format : ");
		System.out.println("1) PDF");
		System.out.println("2) CSV");
		System.out.print("> ");
		int n = sc.nextInt();
		sc.nextLine();
		switch (n) {
		case 1:
			boolean createrPdfFolder = new File("C:\\interface" + "\\PDF").mkdir();
			System.out.print("Type the report content: ");
			String PDFcontent = sc.nextLine();
			Report PDFreport = new Report(new PdfReportGenerator());
			PDFreport.export(PDFcontent);
			break;
		case 2:
			boolean createrCsvFolder = new File("C:\\interface" + "\\CSV").mkdir();
			System.out.print("Type the report content: ");
			String CSVcontent = sc.nextLine();
			Report CSVreport = new Report(new CsvReportGenerator());
			CSVreport.export(CSVcontent);
			break;
		default:
			System.out.println("Invalid Option!");
		}

		sc.close();
	}

}
