/*
 * Ler um n�mero inteiro N e calcular todos os seus divisores.
 */

import java.util.Scanner;

public class Ex23 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.println("Digite um numero: ");
		int n = sc.nextInt();

		for (int i = 1; i <= n; i++) {
			if (n % i == 0) {
				System.out.println(i);
			}

		}
		sc.close();
	}

}
