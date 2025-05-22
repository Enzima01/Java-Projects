/*Fazer um programa para ler as medidas dos lados de dois triângulos X e Y (suponha medidas válidas). 
 *Em seguida, mostrar o valor das áreas dos dois triângulos e dizer qual dos dois triângulos possui a maior área.
 *A fórmula para calcular a área de um triângulo a partir das medidas de seus lados a, b e c é a fórmula de Heron.
 */

import java.util.Locale;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);

		Scanner sc = new Scanner(System.in);

		Triangle x = new Triangle();
		Triangle y = new Triangle();

		System.out.println("Enter the measures of triangle X: ");
		x.a = sc.nextDouble();
		x.b = sc.nextDouble();
		x.c = sc.nextDouble();

		System.out.println("Enter the measures of triangle Y: ");
		y.a = sc.nextDouble();
		y.b = sc.nextDouble();
		y.c = sc.nextDouble();

		double areaX = x.area();

		double areaY = y.area();

		System.out.printf("Triangle X area: %.4f%n", areaX);
		System.out.printf("Triangle Y area: %.4f%n", areaY);
		char larger;

		if (areaX > areaY) {
			larger = 'X';
			System.out.println("Larger Area: " + larger);
		}
		else if (areaY > areaX) {
			larger = 'Y';
			System.out.println("Larger Area: " + larger);
		}
		else {
			System.out.println("Both have the same area");
		}

		sc.close();
	}

}