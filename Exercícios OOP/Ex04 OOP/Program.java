/* PT-BR |
 * Fazer um programa para ler os valores da largura e altura de um retângulo.
 * Em seguida, mostrar na tela o valor de sua área, perímetro e diagonal.
 * 
 * EN |
 * Create a program to read the width and height values of a rectangle.
 * Then, show its area, perimeter and diagonal on screen.
 */

import java.util.Locale;
import java.util.Scanner;

public class Program {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner (System.in);
		Rectangle rectangle = new Rectangle();
		
		System.out.println("Enter rectangle width and height: ");
		rectangle.width = sc.nextDouble();
		rectangle.height = sc.nextDouble();
		
		System.out.println(rectangle);
		
		sc.close();

	}

}
