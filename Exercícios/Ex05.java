/*
* Fazer um programa para ler o c�digo de uma pe�a 1, o n�mero de pe�as 1, o
* valor unit�rio de cada pe�a 1, o c�digo de uma pe�a 2, o n�mero de pe�as 2 e
* o valor unit�rio de cada pe�a 2. Calcule e mostre o valor a ser pago
*/

import java.util.Scanner;

public class Ex05 {

	public static void main(String[] args) {

		Scanner entrada = new Scanner(System.in);

		System.out.println("Digite o codigo da pe�a 1: ");
		int codigo1 = entrada.nextInt();
		System.out.println("Digite a quantidade de pe�a 1: ");
		int qtd1 = entrada.nextInt();
		System.out.println("Digite o valor da pe�a 1: ");
		float valor1 = entrada.nextFloat();
		float total1 = (int) qtd1 * (float) valor1;

		System.out.println("Digite o codigo da pe�a 2: ");
		int codigo2 = entrada.nextInt();
		System.out.println("Digite a quantidade de pe�a 2: ");
		int qtd2 = entrada.nextInt();
		System.out.println("Digite o valor da pe�a 2: ");
		float valor2 = entrada.nextFloat();
		float total2 = (int) qtd2 * (float) valor2;

		float pagar = total1 + total2;

		System.out.printf("VALOR A PAGAR: %.2f", pagar);
	}

}
