/* Sistema que solicita ao usuário a quantidade de alunos e, 
 * para cada um, pede o nome e as notas de duas provas. 
 * Em seguida, calcula a média das notas e 
 * exibe se o aluno foi aprovado (média maior ou igual a 6) ou reprovado (média menor que 6).
 * */

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner entrada = new Scanner(System.in);
		int aluno, i = 0;
		String nome;

		System.out.printf("Digite a quantidade de alunos:");
		aluno = entrada.nextInt();

		for (i = 0; i < aluno; i++) {

			System.out.print("Digite o nome do aluno: ");
			nome = entrada.next();

			System.out.print("Digite a nota da prova 1: ");
			float n1 = entrada.nextFloat();

			System.out.print("Digite a nota da prova 2: ");
			float n2 = entrada.nextFloat();

			float media = (n1 + n2) / 2;
			System.out.printf("Media de %s: %.2f\n", nome, media);

			if (media < 6) {
				System.out.println("Aluno(a) Reprovado(a)!\n");
			} 
			
			else {
				System.out.println("Aluno(a) Aprovado(a)!\n");
			}

		}

	}

}
