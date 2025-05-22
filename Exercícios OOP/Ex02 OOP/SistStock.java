/* Fazer um programa para ler os dados de um produto em estoque (nome, preço e quantidade no estoque). Em seguida:
 * 1) Mostrar os dados do produto (nome, preço, quantidade no estoque, valor total no estoque)
 * 2) Realizar uma entrada no estoque e mostra novamente os dados do produto
 * 3) Realizer uma saída no estoque e mostrar novamente os dados do produto
 */

import java.util.Locale;
import java.util.Scanner;

public class SistStock {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		Locale.setDefault(Locale.US);
		
		Product product = new Product();
		
		System.out.println("Enter the product data:");
		
		System.out.print("Name: ");
		product.name = sc.nextLine();
		
		System.out.print("Price: ");
		product.price = sc.nextDouble();
		
		System.out.print("Quantity in stock: ");
		product.quantity = sc.nextInt();
		
		System.out.println();
		System.out.println("Product data: " + product);
		
		//System.out.printf("Product data: %s, $ %.2f, %d units, Total: $ %.2f", product.name,product.price,product.quantity,product.TotalValueInStock());
		
		System.out.println();
		System.out.print("Enter the numbers of products to be added in stock: ");
		int quantity = sc.nextInt();
		product.AddProducts(quantity);
		
		System.out.println();
		System.out.println("Updated data: " + product);
		
		System.out.println();
		System.out.print("Enter the numbers of products to be removed from stock: ");
		quantity = sc.nextInt();
		product.RemoveProducts(quantity);
		
		System.out.println();
		System.out.println("Updated data: " + product);
		
		sc.close();
	}

}
