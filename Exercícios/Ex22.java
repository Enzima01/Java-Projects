/*Ler um valor N. Calcular e escrever seu respectivo fatorial. Fatorial de N = N * (N-1) * (N-2) * (N-3) * ... * 1.
Lembrando que, por defini��o, fatorial de 0 � 1. 
*/

import java.util.Scanner;

public class Ex22 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.print("Digite um numero pra fatorar: ");
		int n = sc.nextInt();
		int fatorial = 1;

		for (int i = 1; i <= n; i++) {
			fatorial = fatorial * i;
		}
		System.out.println(fatorial);
		sc.close();
	}

}
