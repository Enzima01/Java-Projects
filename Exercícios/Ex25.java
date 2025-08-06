/*Fazer um programa para ler nome, idade e altura de N pessoas. 
 *Depois, mostrar na tela a altura média das pessoas, e mostrar também a porcentagem de pessoas com menos de 16 anos,
 *bem como os nomes dessas pessoas caso houver.
 */

import java.util.Locale;
import java.util.Scanner;

public class Ex25 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Locale.setDefault(Locale.US);

		double acumuladorAltura = 0;
		int qtdPessoaMenor = 0;
		double porcentagem = 0;

		System.out.print("Quantas pessoas serao digitadas? ");
		int n = sc.nextInt();

		String[] nome = new String[n];
		int[] idade = new int[n];
		double[] altura = new double[n];

		for (int i = 0; i < n; i++) {
			System.out.println("Dados da " + (i + 1) + "a" + " pessoa: ");
			sc.nextLine();
			System.out.print("Nome: ");
			nome[i] = sc.nextLine();
			System.out.print("Idade: ");
			idade[i] = sc.nextInt();
			System.out.print("Altura: ");
			altura[i] = sc.nextDouble();
			acumuladorAltura += altura[i];

			if (idade[i] < 16) {
				qtdPessoaMenor++;
			}
		}

		porcentagem = ((double) qtdPessoaMenor / n) * 100;

		double mediaAltura = acumuladorAltura / n;
		System.out.printf("Altura media: %.2f%n", mediaAltura);

		System.out.println("Pessoas com menos de 16 anos: " + porcentagem + "%");

		for (int i = 0; i < n; i++) {
			if (idade[i] < 16) {
				System.out.printf("%s\n", nome[i]);
			}
		}

		sc.close();
	}

}
