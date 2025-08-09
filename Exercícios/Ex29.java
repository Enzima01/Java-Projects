/*
 * Desenvolva um programa que leia a quantidade de alunos de uma turma e, para cada aluno, solicite o nome e a respectiva nota. 
 * Ao final, o programa deve exibir todas as notas digitadas, indicar a maior e a menor nota, 
 * calcular e mostrar a média da turma e listar as notas que ficaram acima dessa média. 
 * Em seguida, o programa deve permitir que o usuário digite uma nota para pesquisa e informar todos os alunos que possuem essa nota, 
 * incluindo a posição em que se encontram na listagem. Caso a nota pesquisada não exista, exibir mensagem apropriada.
 * 
 */

import java.util.Locale;
import java.util.Scanner;

public class Ex29 {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		System.out.print("Quantos alunos na turma? ");
		int n = sc.nextInt();

		String[] nomes = new String[n];
		double[] notas = new double[n];
		double somaNotas = 0;

		for (int i = 0; i < n; i++) {
			System.out.printf("Digite o nome do aluno %d: ", (i + 1));
			sc.nextLine();
			nomes[i] = sc.nextLine();
			System.out.printf("Digite a nota de %s: ", nomes[i]);
			notas[i] = sc.nextDouble();
			somaNotas += notas[i];
		}

		System.out.print("\n\nNotas digitadas: ");
		for (int i = 0; i < n; i++) {
			System.out.print(notas[i] + "  ");
		}

		double maiorNota = notas[0];
		double menorNota = notas[0];

		for (int i = 0; i < n; i++) {
			if (notas[i] > maiorNota) {
				maiorNota = notas[i];
			}

			if (notas[i] < menorNota) {
				menorNota = notas[i];
			}
		}
		System.out.println("\nMaior nota: " + maiorNota);
		System.out.println("Menor nota: " + menorNota);

		double media = somaNotas / n;
		System.out.printf("\nMedia da turma: %.2f%n", media);

		System.out.print("Notas acima da media: ");
		for (int i = 0; i < n; i++) {
			if (notas[i] > media) {
				System.out.print(notas[i] + " ");
			}
		}

		System.out.print("\nDigite a nota que deseja buscar: ");
		double procurar = sc.nextDouble();

		boolean encontrada = false;

		for (int i = 0; i < n; i++) {
			if (notas[i] == procurar) {
				System.out.println("A nota " + notas[i] + " foi encontrada na posição " + i);
				encontrada = true;
			}
		}

		if (!encontrada) {
			System.out.println("Essa nota não foi encontrada.");
		}

		sc.close();
	}

}
