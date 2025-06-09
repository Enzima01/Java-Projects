/* PT-BR |
 * Fazer um programa para ler um valor numérico qualquer,
 * e daí mostrar quanto seria o valor de uma circunferência e do volume de uma esfera para um raio daquele valor.
 * Informar também o valor de PI com duas casas decimais.
 * 
 * EN |
 * Create a program to read any numeric value,
 * then show the circumference and volume of a sphere with that value as the radius.
 * Also display the value of the PI with two decimal places.
 */


import java.util.Scanner;

public class Application {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.print("Enter radius: ");
		double radius = sc.nextDouble();

		System.out.printf("Circumference: %.2f%n", Calculator.circunfence(radius));
		System.out.printf("Volume: %.2f%n", Calculator.volume(radius));
		System.out.println("PI value: " + Calculator.PI);

		sc.close();

	}

}
