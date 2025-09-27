/* PT-BR|
 * Fazer um programa para ler os dados de N produtos (N fornecido pelo usuário).
 * Ao final, mostrar a etiqueta de preço de cada produto na mesma ordem em que foram digitados.
 * Todo produto possui nome e preço.
 * Produtos importados possuem uma taxa de alfândega, e produtos usados possuem data de fabricação. 
 * Estes dados específicos devem ser acrescentados na etiqueta de preço.
 * Para produtos importados, a taxa e alfândega deve ser acrescentada ao preço final do produto.
 * 
 * EN|
 * Make a program to read the data of N products (N provided by the user).
 * At the end, show the price tag of each product in the same order they were entered.
 * Every product has a name and a price.
 * Imported products have a customs fee, and used products have a manufacture date.
 * These specific data must be added to the price tag.
 * For imported products, the customs fee must be added to the final price of the product.
 */

package application;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

import entities.ImportedProduct;
import entities.Product;
import entities.UsedProduct;

public class Program {

	public static void main(String[] args) throws ParseException {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		List<Product> list = new ArrayList<>();
		SimpleDateFormat sdf1 = new SimpleDateFormat("dd/MM/yyyy");

		System.out.print("Enter the number of products: ");
		int n = sc.nextInt();

		for (int i = 0; i < n; i++) {
			System.out.println("\nProduct #" + (i + 1) + " data:");
			System.out.print("Common, used or imported (c/u/i)? ");
			char ch = sc.next().charAt(0);
			System.out.print("Name: ");
			sc.nextLine();
			String name = sc.nextLine();
			System.out.print("Price: ");
			double price = sc.nextDouble();

			switch (ch) {
			case 'u':
				System.out.print("Manufacture date (DD/MM/YYYY): ");
				Date manufactureDate = sdf1.parse(sc.next());
				Product usedProduct = new UsedProduct(name, price, manufactureDate);
				list.add(usedProduct);
				break;

			case 'i':
				System.out.print("Custom fee: ");
				double customFee = sc.nextDouble();
				Product importedProduct = new ImportedProduct(name, price, customFee);
				list.add(importedProduct);
				break;

			case 'c':
				Product product = new Product(name, price);
				list.add(product);
				break;

			default:
				System.out.println("Invalid option!");
			}

		}

		System.out.println("\nPRICE TAGS:");
		for (Product product : list) {
			System.out.println(product.priceTag());
		}
		sc.close();
	}

}

