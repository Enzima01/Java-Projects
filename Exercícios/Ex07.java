/*
* Fazer um programa para ler um n�mero inteiro, e depois dizer se este n�mero � negativo ou n�o
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
