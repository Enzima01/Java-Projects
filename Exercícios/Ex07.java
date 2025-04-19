/*
* Fazer um programa para ler um número inteiro, e depois dizer se este número é negativo ou não
*/

import java.util.Scanner;

public class Ex07 {

	public static void main(String[] args) {

		Scanner entrada = new Scanner(System.in);

		System.out.println("Digite um numero: ");
		int x = entrada.nextInt();
		if (x < 0) {
			System.out.println("NEGATIVO");
		} else {
			System.out.println("POSITIVO");
		}

	}

}
