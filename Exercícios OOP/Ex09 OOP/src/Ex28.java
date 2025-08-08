/* PT-BR
 * Escreva um programa que leia o nome e a nota final de cada aluno de uma turma. 
 * Em seguida, deve exibir na tela a media geral das notas, a maior e menor nota encontrada e listar todos os alunos acima da média geral.
 * 
 * EN
 * Write a program that reads the name and final grade of each student in a class. 
 * Then, display on the screen the overall average grade, the highest and lowest grade found, and list all students above the overall average.
 * 
 */


import java.util.Locale;
import java.util.Scanner;

public class Ex28 {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		System.out.print("Digite a quantidade de alunos: ");
		int n = sc.nextInt();

		String[] nomes = new String[n];
		double[] notas = new double[n];

		for (int i = 0; i < n; i++) {
			sc.nextLine();
			System.out.print("Digite o nome do aluno " + (i + 1) + ": ");
			nomes[i] = sc.nextLine();
			System.out.print("Digite a nota final do aluno " + (i + 1) + ": ");
			notas[i] = sc.nextDouble();
		}

		Operations op = new Operations(notas, nomes);

		System.out.printf("%nMedia geral da turma: %.2f%n", op.mediaNotas());
		op.maiorNota();
		op.menorNota();
		op.maiorMediaNotas();

		sc.close();
	}

}
