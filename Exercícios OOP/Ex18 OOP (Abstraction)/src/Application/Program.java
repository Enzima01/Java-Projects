/* PT-BR|
 * Fazer um programa para ler os dados de N figuras (N fornecido pelo usuário),
 * e depois mostrar as áreas destas figuras na mesma ordem em que foram digitadas.
 * 
 * EN|
 * Create a program to read data from N figures (N provided by the user),
 * and then display the areas of these figures in the same order in which they were scanned.
 */

package Application;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

import entities.Circle;
import entities.Rectangle;
import entities.Shape;
import entities.enums.Color;

public class Program {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		List<Shape> list = new ArrayList<>();

		System.out.print("Enter the number of shapes: ");
		int n = sc.nextInt();

		for (int i = 0; i < n; i++) {
			System.out.println("\nShape #" + (i + 1) + " data:");
			System.out.print("Rectangle or Circle (r/c)? ");
			char resp = sc.next().charAt(0);
			System.out.print("Color (BLACK/RED/BLUE): ");
			Color color = Color.valueOf(sc.next());

			switch (resp) {
			case 'r':
				System.out.print("Width: ");
				double width = sc.nextDouble();
				System.out.print("Height: ");
				double height = sc.nextDouble();
				Shape rectangle = new Rectangle(color, width, height);
				list.add(rectangle);
				break;
			case 'c':
				System.out.print("Radius: ");
				double radius = sc.nextDouble();
				Shape circle = new Circle(color, radius);
				list.add(circle);
				break;

			default:
				System.out.println("Invalid option!");
			}

		}

		System.out.println("\nSHAPE AREAS:");
		for (Shape shape : list) {
			System.out.println(String.format("%.2f", shape.area()));
		}

		sc.close();
	}

}
