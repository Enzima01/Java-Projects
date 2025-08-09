/*
 * Tem-se um conjunto de dados contendo a altura e o gênero (M, F) de N pessoas. 
 * Fazer um programa que calcule e escreva a maior e a menor altura do grupo, 
 * a média de altura das mulheres, e o número de homens. 
 */

import java.util.Locale;
import java.util.Scanner;

public class Ex28 {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		System.out.print("Quantas pessoas serao digitadas? ");
		int n = sc.nextInt();
		double[] altura = new double[n];
		char[] genero = new char[n];

		int totalHomem = 0;
		double somaAltura = 0;
		int totalMulher = 0;

		for (int i = 0; i < n; i++) {
			System.out.printf("Altura da %da pessoa: ", i + 1);
			altura[i] = sc.nextDouble();
			System.out.printf("Genero da %da pessoa: ", i + 1);
			genero[i] = sc.next().charAt(0);

			if (genero[i] == ('F')) {

				somaAltura += altura[i];
				totalMulher++;
			}

			if (genero[i] == 'M') {

				totalHomem++;
			}
		}

		double maior = altura[0];
		double menor = altura[0];

		for (int i = 0; i < n; i++) {

			if (altura[i] > maior) {
				maior = altura[i];
			}
			if (altura[i] < menor) {
				menor = altura[i];
			}

		}

		double mediaAltura = somaAltura / totalMulher;

		System.out.printf("Menor Altura = %.2f%n", menor);
		System.out.printf("Maior Altura = %.2f%n", maior);
		System.out.printf("Media das alturas das mulheres = %.2f%n", mediaAltura);
		System.out.printf("Numero de homens = %d%n", totalHomem);

		sc.close();
	}

}
