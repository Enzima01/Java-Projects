/* Faça um programa que leia N números inteiros e armazene-os em um vetor. 
 * Em seguida, mostre na tela todos os números pares, 
 * e também a quantidade de números pares. 
 */

import java.util.Scanner;

public class Ex26 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int qtdPares = 0;
		System.out.print("Quantos numeros voce vai digitar? ");
		int n = sc.nextInt();

		int[] vetor = new int[n];

		for (int i = 0; i < vetor.length; i++) {
			System.out.print("Digite um numero: ");
			vetor[i] = sc.nextInt();
			if (vetor[i] % 2 == 0) {
				qtdPares++;
			}

		}

		System.out.println("\nNUMEROS PARES:");
		for (int i = 0; i < vetor.length; i++) {
			if (vetor[i] % 2 == 0) {

				System.out.printf("%d  ", vetor[i]);

			}
		}
		System.out.println("\n\nQuantidade de Pares: " + qtdPares);

		sc.close();
	}

}
