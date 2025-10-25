/* PT-BR|
 * Fazer um programa para ler o caminho de um arquivo .csv e .txt contendo os dados de itens vendidos.
 * Cada item possui um nome, preço unitário e quantidade.
 * Você deve gerar um novo arquivo chamado "summary.csv",
 * localizado em uma subpasta chamada "out" a partir da pasta "C:\",
 * contendo apenas o nome e o valor total para aquele item.
 * 
 * EN|
 * Write a program to read the path of a .csv and .txt file containing the data for items sold.
 * Each item has a name, unit price, and quantity.
 * You should generate a new file called "summary.csv",
 * located in a subfolder called "out" within the "C:\" folder,
 * containing only the name and total value for that item.
 */

package application;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

import entities.Product;

public class Program {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		List<Product> list = new ArrayList<>();

		boolean folderPath = new File("C:\\" + "CSV\\out").mkdir();
		String pathCsv = "C:\\CSV\\out\\summary.csv";
		String pathTxt = "C:\\CSV\\out\\summary.txt";

		System.out.print("How many products? ");
		int n = sc.nextInt();

		for (int i = 0; i < n; i++) {
			sc.nextLine();
			System.out.println("\nProduct #" + (i + 1) + ":");
			System.out.print("Name: ");
			String name = sc.nextLine();
			System.out.print("Price: ");
			double price = sc.nextDouble();
			System.out.print("Quantity: ");
			int quantity = sc.nextInt();

			Product product = new Product(name, price, quantity);
			list.add(product);
		}

		try {
			File fileCsv = new File(pathCsv);
			File fileTxt = new File(pathTxt);
			System.out.println(fileCsv.getName() + " created!");
			System.out.println(fileTxt.getName() + " created!");
		} catch (Exception e) {
			System.out.println("Error: " + e.getMessage());
		}

		try (BufferedWriter bw = new BufferedWriter(new FileWriter("C:\\CSV\\out\\summary.csv"))) {
			for (Product product : list) {
				bw.write(product.getName() + ", " + String.format("%.2f", product.total()));
				bw.newLine();
			}
		} catch (IOException e) {
			System.out.println("Error: " + e.getMessage());
		}

		try (BufferedWriter bw = new BufferedWriter(new FileWriter("C:\\CSV\\out\\summary.txt"))) {
			for (Product product : list) {
				bw.write(product.getName() + ", " + String.format("%.2f", product.total()));
				bw.newLine();
			}
			System.out.println();
		} catch (IOException e) {
			System.out.println("Error: " + e.getMessage());
		}

		sc.close();
	}

}
