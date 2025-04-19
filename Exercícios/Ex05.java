/*
* Fazer um programa para ler o código de uma peça 1, o número de peças 1, o
* valor unitário de cada peça 1, o código de uma peça 2, o número de peças 2 e
* o valor unitário de cada peça 2. Calcule e mostre o valor a ser pago
*/

import java.util.Scanner;

public class Ex05 {

	public static void main(String[] args) {

		Scanner entrada = new Scanner(System.in);

		System.out.println("Digite o codigo da peça 1: ");
		int codigo1 = entrada.nextInt();
		System.out.println("Digite a quantidade de peça 1: ");
		int qtd1 = entrada.nextInt();
		System.out.println("Digite o valor da peça 1: ");
		float valor1 = entrada.nextFloat();
		float total1 = (int) qtd1 * (float) valor1;

		System.out.println("Digite o codigo da peça 2: ");
		int codigo2 = entrada.nextInt();
		System.out.println("Digite a quantidade de peça 2: ");
		int qtd2 = entrada.nextInt();
		System.out.println("Digite o valor da peça 2: ");
		float valor2 = entrada.nextFloat();
		float total2 = (int) qtd2 * (float) valor2;

		float pagar = total1 + total2;

		System.out.printf("VALOR A PAGAR: %.2f", pagar);
	}

}
