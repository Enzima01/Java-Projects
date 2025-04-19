/*
* Fazer um programa para ler um número inteiro e dizer se este número é par ou ímpar.
*/

import java.util.Scanner;

public class Ex08 {

	public static void main(String[] args) {

		Scanner entrada = new Scanner(System.in);
		System.out.println("Digite um numero: ");
		int x = entrada.nextInt();
		if (x % 2 == 0) {
			System.out.println("Par");
		} else {
			System.out.println("Impar");
		}
	}
}
